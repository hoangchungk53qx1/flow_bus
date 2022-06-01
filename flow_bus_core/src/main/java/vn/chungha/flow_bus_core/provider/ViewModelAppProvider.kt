package vn.chungha.flow_bus_core.provider

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import vn.chungha.flow_bus_core.FlowBusInitApplication

object ViewModelAppProvider : ViewModelStoreOwner {
    private val eventViewModel: ViewModelStore = ViewModelStore()

    override fun getViewModelStore(): ViewModelStore = eventViewModel

    private val applicationProvider: ViewModelProvider by lazy {
        ViewModelProvider(
            ViewModelAppProvider,
            ViewModelProvider.AndroidViewModelFactory.getInstance(FlowBusInitApplication.application)
        )
    }

    fun <T : ViewModel> getApplicationScope(model: Class<T>): T = applicationProvider[model]

}

