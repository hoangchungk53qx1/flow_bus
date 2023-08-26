package vn.chungha.flow_bus

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber
import vn.chungha.flow_bus.databinding.ActivityMainBinding
import vn.chungha.flow_bus_core.collect.collectFlowBus
import vn.chungha.flow_bus_core.post.busEvent

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bindSecondFragment()
        binding.gotoThirdScreen.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
        sendFlowBus()
        observeGlobal()
    }

    private fun sendFlowBus() {
        binding.sendGlobal.setOnClickListener {
            busEvent(GlobalEvent("Hello from MainActivity with GlobalEvent"))
        }
    }

    private fun observeGlobal() {
        collectFlowBus<GlobalEvent> {
            Timber.tag(TAG).d("MainActivity received GlobalEvent  :%s", it.name)
        }
    }

    private fun bindSecondFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.fragment, SecondFragment())
            .commitAllowingStateLoss()
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}