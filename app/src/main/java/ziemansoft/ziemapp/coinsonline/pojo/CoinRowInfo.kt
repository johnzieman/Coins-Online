package ziemansoft.ziemapp.coinsonline.pojo

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinRowInfo(
        @SerializedName("RAW")
        @Expose
        val coinPriceInfoJsonObject: JsonObject? = null
)