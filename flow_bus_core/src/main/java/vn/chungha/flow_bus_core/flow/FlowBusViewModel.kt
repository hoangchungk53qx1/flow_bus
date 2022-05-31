package vn.chungha.flow_bus_core.flow

import kotlinx.coroutines.flow.MutableSharedFlow

class FlowBusViewModel {
    // Event
    private val eventFlows : HashMap<String,MutableSharedFlow<Any>> = HashMap()

    private val stickyEventFlows: HashMap<String, MutableSharedFlow<Any>> = HashMap()

}