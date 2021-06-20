package com.andross.ui.base.viewmodel

import androidx.lifecycle.ViewModel
import com.andross.utitlities.lifecycle.EventQueue

open class BaseViewModel : ViewModel() {

    val eventsQueue = EventQueue()
}
