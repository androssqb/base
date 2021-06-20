package com.andross.ui.events

import androidx.navigation.NavDirections
import com.andross.utitlities.lifecycle.Event

sealed class NavigationEvent : Event

data class Navigate(val direction: NavDirections) : NavigationEvent()

object NavigateUp : NavigationEvent()
