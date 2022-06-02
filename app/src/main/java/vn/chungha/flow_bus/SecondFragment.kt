package vn.chungha.flow_bus

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import vn.chungha.flow_bus_core.post.busEvent

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sendBus()
        view.findViewById<MaterialButton>(R.id.sendEventSticky).setOnClickListener {
            busEvent(GlobalEvent("Hello from SecondFragment"))
        }
    }

    private fun sendBus() {

    }
}