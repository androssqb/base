package com.andross.app.ui.base.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andross.utitlities.lifecycle.Event
import com.andross.utitlities.lifecycle.EventQueue

open class BaseViewModel : ViewModel() {

    val eventsQueue = EventQueue()

    protected fun offerEvent(event: Event) {
        eventsQueue.offerEvent(coroutineScope = viewModelScope, event = event)
    }
}
