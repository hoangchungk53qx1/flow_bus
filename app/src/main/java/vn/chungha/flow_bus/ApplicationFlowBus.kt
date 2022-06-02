package vn.chungha.flow_bus

import android.app.Application
import vn.chungha.flow_bus_core.FlowBusInitApplication

// Step 1
class ApplicationFlowBus : Application() {
    override fun onCreate() {
        super.onCreate()
        FlowBusInitApplication.initializer(this)
    }
}