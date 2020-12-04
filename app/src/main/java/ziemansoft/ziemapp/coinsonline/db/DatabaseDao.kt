package ziemansoft.ziemapp.coinsonline.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ziemansoft.ziemapp.coinsonline.pojo.CoinPriceInfo

@Dao
interface DatabaseDao {
    @Query("SELECT * FROM coinsInfo ORDER BY price DESC")
    fun getPriceList():LiveData<List<CoinPriceInfo>>

    @Query("SELECT * FROM coinsInfo WHERE fromSymbols ==:fsym LIMIT 1")
    fun getPriceInfoAboutCoin(fsym: String):LiveData<CoinPriceInfo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPriceList(priceList: List<CoinPriceInfo>)
}