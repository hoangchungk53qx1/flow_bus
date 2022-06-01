package vn.chungha.flow_bus_core

import android.app.Application
import timber.log.Timber

object FlowBusInitApplication {
    lateinit var application: Application

    fun initializer(application: Application) {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        FlowBusInitApplication.application = application
    }
}