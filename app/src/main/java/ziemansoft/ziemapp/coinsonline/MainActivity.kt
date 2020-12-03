package ziemansoft.ziemapp.coinsonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import ziemansoft.ziemapp.coinsonline.viewmodels.CoinViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var coinViewModel: CoinViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        coinViewModel = ViewModelProvider(this).get(CoinViewModel::class.java)
        coinViewModel.getUserContext(this)
        coinViewModel.loadData()
    }
}