package vn.chungha.flow_bus

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
        binding.postLayout.setOnClickListener {
            busEvent(GlobalEvent("HelloWorld"))
        }
        collectFlowBus<GlobalEvent> {
            Timber.tag("TAG").d("MainActivity received GlobalEvent  :%s", it.name)
        }
    }
}