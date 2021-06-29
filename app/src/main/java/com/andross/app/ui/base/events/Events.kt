package com.andross.app.ui.base.events

import androidx.annotation.StringRes
import androidx.navigation.NavDirections
import com.andross.utitlities.lifecycle.Event

sealed class NavigationEvent : Event

data class Navigate(val direction: NavDirections) : NavigationEvent()

object NavigateUp : NavigationEvent()

data class ShowMessageEvent(@StringRes val messageId: Int) : Event
