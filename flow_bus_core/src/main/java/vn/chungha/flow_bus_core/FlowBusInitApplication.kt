package vn.chungha.flow_bus_core

import android.app.Application

object FlowBusInitApplication {
    lateinit var application: Application
    var timber: TimberEvent? = null

    fun initializer(application: Application, timber: TimberEvent? = null) {
        FlowBusInitApplication.application = application
        this.timber = timber
    }
}