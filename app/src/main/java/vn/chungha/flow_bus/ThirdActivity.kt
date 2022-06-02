package vn.chungha.flow_bus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber
import vn.chungha.flow_bus.databinding.ThirdActivityBinding
import vn.chungha.flow_bus_core.collect.collectFlowBus

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ThirdActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ThirdActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        collectFlowBus<GlobalEvent>(isSticky = true) {
            Timber.tag(TAG_THIRD_SCREEN).d("event get ==> ${it.name}")
            binding.getEvent.text = it.name
        }
    }

    companion object {
        private const val TAG_THIRD_SCREEN = "ThirdActivity"
    }
}