package com.andross.app.ui.base.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andross.app.ui.base.events.Event
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

open class BaseViewModel : ViewModel() {

//    private val eventChannel = Channel<Event>(Channel.BUFFERED)
//    val eventsFlow = eventChannel.receiveAsFlow()
//
//    protected fun offerEvent(event: Event) {
//        viewModelScope.launch {
//            eventChannel.send(event)
//        }
//    }

    private val eventChannel = MutableSharedFlow<Event>(replay = 0)
    val eventsQueue: SharedFlow<Event> = eventChannel.asSharedFlow()

    protected fun offerEvent(event: Event) {
        viewModelScope.launch {
            eventChannel.emit(event)
        }
    }
}
