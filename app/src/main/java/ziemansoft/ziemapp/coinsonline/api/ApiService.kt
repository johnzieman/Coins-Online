package ziemansoft.ziemapp.coinsonline.api

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import ziemansoft.ziemapp.coinsonline.pojo.CoinInfoListoOfDatum
import ziemansoft.ziemapp.coinsonline.pojo.CoinRowInfo

interface ApiService {
    @GET("data/pricemultifull")
    fun getCurrentFullData(
            @Query("api_key") apiKey: String = "7438f5426f11a55ebbf4d9bca3bef34dbec80b8e6c2bd3dc3c334f8c8e2352ee",
            @Query("fsyms") fSyms: String,
            @Query("tsyms") tsyms: String = "USD,EUR"
    ): Single<CoinRowInfo>

    @GET("data/top/totalvolfull")
    fun getTopCoinsList(
            @Query("api_key") apiKey: String = "7438f5426f11a55ebbf4d9bca3bef34dbec80b8e6c2bd3dc3c334f8c8e2352ee",
            @Query("limit") limit:Int = 10,
            @Query("tsym") tsyms: String = "USD"
    ): Single<CoinInfoListoOfDatum>
}