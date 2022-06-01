package vn.chungha.flow_bus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vn.chungha.flow_bus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.postLayout.setOnClickListener {

        }
    }
}