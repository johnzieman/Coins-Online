package ziemansoft.ziemapp.coinsonline.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinInfoListoOfDatum(
        @SerializedName("Data")
        @Expose
        val data:List<Datum>? = null
)