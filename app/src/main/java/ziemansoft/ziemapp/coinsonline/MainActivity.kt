package ziemansoft.ziemapp.coinsonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.MainThread
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import ziemansoft.ziemapp.coinsonline.api.ApiFactory

class MainActivity : AppCompatActivity() {
    private val compositeDespoable = CompositeDisposable()
    private val TAG = "MainActivityTest"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val disposable = ApiFactory.apiService.getTopCoinsList(limit = 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Log.d(TAG, it.toString())
                }, {
                    Log.d(TAG, it.toString())
                })
        compositeDespoable.add(disposable)
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDespoable.dispose()
    }
}