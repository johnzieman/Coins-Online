package ziemansoft.ziemapp.coinsonline.viewmodels

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.room.Database
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import ziemansoft.ziemapp.coinsonline.api.ApiFactory
import ziemansoft.ziemapp.coinsonline.db.AppDatabase
import ziemansoft.ziemapp.coinsonline.pojo.CoinPriceInfo
import ziemansoft.ziemapp.coinsonline.pojo.CoinRowInfo
import java.util.concurrent.TimeUnit

open class CoinViewModel : ViewModel() {
    var db: AppDatabase? = null
    fun getUserContext(context: Context) {
        db = AppDatabase.getInstance(context)
    }

    private val TAG = "MainActivityTest"
    private val compositeDesposable = CompositeDisposable()

    init {
        loadData()
    }

    fun getDetailInfo(fSym: String): LiveData<CoinPriceInfo>? {
        return db?.databaseDao()?.getPriceInfoAboutCoin(fSym)
    }

    fun getPriceList():LiveData<List<CoinPriceInfo>>?{
        return db?.databaseDao()?.getPriceList()
    }
    fun loadData() {
        val disposable = ApiFactory.apiService.getTopCoinsList(limit = 50)
                .map { it.data?.map { it.coinInfo?.name }?.joinToString(",") }
                .flatMap { ApiFactory.apiService.getCurrentFullData(fSyms = it) }
                .map { getPriceListFromRowData(it) }
                .delay(30, TimeUnit.SECONDS)
                .repeat()
                .subscribeOn(Schedulers.io())
                .subscribe({
                    db?.databaseDao()?.insertPriceList(it)
                    Log.d(TAG, it.toString())

                }, {
                    Log.d(TAG, it.message.toString())
                })
        compositeDesposable.add(disposable)
    }

    private fun getPriceListFromRowData(coinRowInfo: CoinRowInfo): List<CoinPriceInfo> {
        val result = ArrayList<CoinPriceInfo>()
        val jsonObject = coinRowInfo.coinPriceInfoJsonObject
        if (jsonObject == null) return result
        val coinKeySet = jsonObject.keySet()
        for (coinKey in coinKeySet) {
            val currencyJson = jsonObject.getAsJsonObject(coinKey)
            val currencyKeySet = currencyJson.keySet()
            for (currencyKey in currencyKeySet) {
                val priceInfo = Gson().fromJson(
                        currencyJson.getAsJsonObject(currencyKey),
                        CoinPriceInfo::class.java
                )
                result.add(priceInfo)
            }
        }
        return result

    }

    override fun onCleared() {
        super.onCleared()
        compositeDesposable.dispose()
    }
}

