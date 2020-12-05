package ziemansoft.ziemapp.coinsonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import ziemansoft.ziemapp.coinsonline.adapter.CoinInfoAdapter
import ziemansoft.ziemapp.coinsonline.pojo.CoinPriceInfo
import ziemansoft.ziemapp.coinsonline.viewmodels.CoinViewModel

class MainActivity : AppCompatActivity(){
    private lateinit var coinViewModel: CoinViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = CoinInfoAdapter(this)
        recyclerView.adapter = adapter
        coinViewModel = ViewModelProvider(this).get(CoinViewModel::class.java)
        coinViewModel.getUserContext(this)
        coinViewModel.loadData()
        coinViewModel.getPriceList()?.observe(this, Observer {
            adapter.coinInfoList = it
            Log.d("THISS", it.toString())
        })

        adapter.onCoinClickListener = object: CoinInfoAdapter.OnCoinClickListener{
            override fun onCoinClick(coinPriceInfo: CoinPriceInfo) {
               val intent = DetailInfo.newIntent(this@MainActivity, coinPriceInfo.fromSymbols)
                startActivity(intent)
            }
        }
    }
}