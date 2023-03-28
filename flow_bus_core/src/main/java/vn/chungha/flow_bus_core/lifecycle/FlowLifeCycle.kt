package vn.chungha.flow_bus_core.lifecycle

import androidx.lifecycle.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import vn.chungha.flow_bus_core.flow.FlowBusViewModel
import vn.chungha.flow_bus_core.provider.ViewModelAppProvider

inline fun <reified T> getFlowCollectCount(event: Class<T>): Int =
    ViewModelAppProvider.getApplicationScope(FlowBusViewModel::class.java)
        .getEventObserverCount(event.name)

inline fun <reified T> getFlowCollectCountScope(scope: ViewModelStoreOwner, event: Class<T>) =
    ViewModelProvider(scope)[FlowBusViewModel::class.java].getEventObserverCount(event.name)

fun <T> LifecycleOwner.launchWhenStateAtLeast(
    minState: Lifecycle.State,
    block: suspend CoroutineScope.() -> T
): Job = lifecycleScope.launch {
    lifecycle.repeatOnLifecycle(minState) {
        block()
    }
}