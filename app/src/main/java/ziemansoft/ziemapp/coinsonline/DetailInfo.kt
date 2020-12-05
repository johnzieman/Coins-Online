package ziemansoft.ziemapp.coinsonline

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail_info.*
import ziemansoft.ziemapp.coinsonline.viewmodels.CoinViewModel

class DetailInfo : AppCompatActivity() {
    private lateinit var viewModel: CoinViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_info)
        viewModel = ViewModelProvider(this).get(CoinViewModel::class.java)
        viewModel.getUserContext(this)
        if (!intent.hasExtra("fSym")) {
            finish()
            return
        }
        val fsym = intent.getStringExtra("fSym")
        if (fsym != null) {
            viewModel.getDetailInfo(fsym)?.observe(this, Observer {
                Picasso.get().load(it.getFullUrl()).into(imageViewLogoDetail)
                textViewFSym.text = it.fromSymbols + " / " + it.toSymbols
                textViewPrices.text = it.price.toString() + "$"
                textViewMaxs.text = it.highDay.toString()+ "$"
                textViewMins.text = it.lowDay.toString()+ "$"
                textViewLastContracts.text = it.lastMarket.toString()
                textViewLastUpdates.text = it.getFormattedTime()
            })
        }
    }

    companion object {
        fun newIntent(context: Context, fSym: String): Intent {
            val intent = Intent(context, DetailInfo::class.java)
            intent.putExtra("fSym", fSym)
            return intent
        }
    }
}