package ziemansoft.ziemapp.coinsonline.api

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
    private const val BASE_URL = "https://min-api.cryptocompare.com/"
    val BASE_IMAGE_URL = "https://cryptocompare.com"

    private val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

    val apiService = retrofit.create(ApiService::class.java)
}