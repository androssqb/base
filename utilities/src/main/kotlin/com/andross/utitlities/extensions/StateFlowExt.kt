package com.andross.utitlities.extensions

import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

public inline fun <T> Fragment.collect(stateFlow: StateFlow<T>, crossinline onChanged: (T) -> Unit) {
    stateFlow
        .flowWithLifecycle(lifecycle, Lifecycle.State.STARTED)
        .onEach { onChanged(it) }
        .launchIn(lifecycleScope)
}

public inline fun <T> ComponentActivity.collect(
    stateFlow: StateFlow<T>,
    crossinline onChanged: (T) -> Unit
) {
    stateFlow
        .flowWithLifecycle(lifecycle, Lifecycle.State.STARTED)
        .onEach { onChanged(it) }
        .launchIn(lifecycleScope)
}
