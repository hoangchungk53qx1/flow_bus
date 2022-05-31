package vn.chungha.flow_bus_core

interface TimberEvent {
    fun logEvent(message: String)
    fun logEventThrowException(message: String, throwable: Throwable)
}