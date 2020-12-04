package ziemansoft.ziemapp.coinsonline.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.main_coin_info_card.view.*
import ziemansoft.ziemapp.coinsonline.R
import ziemansoft.ziemapp.coinsonline.pojo.CoinPriceInfo

class CoinInfoAdapter: RecyclerView.Adapter<CoinInfoAdapter.CoinInfoViewHolder>() {
    var coinInfoList: List<CoinPriceInfo> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinInfoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_coin_info_card, parent, false)
        return CoinInfoViewHolder(view)
    }

    override fun onBindViewHolder(holder: CoinInfoViewHolder, position: Int) {
        val coin = coinInfoList[position]
        holder.symbols.text = coin.fromSymbols + " / " +coin.toSymbols
        holder.price.text = coin.price.toString() + "$"
        holder.lastUpdated.text= "Last update: " + coin.getFormattedTime()
        Picasso.get().load(coin.getFullUrl()).into(holder.logoCoin)
    }

    override fun getItemCount() = coinInfoList.size

    inner class CoinInfoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val logoCoin = itemView.imageView
        val symbols = itemView.textView
        val price = itemView.textView2
        val lastUpdated = itemView.textView3
    }
}