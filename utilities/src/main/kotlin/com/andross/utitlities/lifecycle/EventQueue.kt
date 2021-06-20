@file:Suppress("RedundantVisibilityModifierRule")

package com.andross.utitlities.lifecycle

import androidx.activity.ComponentActivity
import androidx.annotation.MainThread
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import java.util.*

public class EventQueue {

    private val stateFlow = MutableStateFlow<Queue<Event>>(LinkedList())

    @MainThread
    public fun offerEvent(event: Event) {
        val queue = stateFlow.value
        queue.add(event)
        stateFlow.value = queue
    }

    public fun collect(coroutineScope: CoroutineScope, onEvent: (Event) -> Unit) {
        stateFlow
            .onEach { consumeEvents(it, onEvent) }
            .launchIn(coroutineScope)
    }

    private inline fun consumeEvents(events: Queue<Event>, consumeEvent: (Event) -> Unit) {
        while (events.isNotEmpty()) consumeEvent(events.remove())
    }
}

public interface Event

@Suppress("NOTHING_TO_INLINE")
public inline fun Fragment.collect(eventQueue: EventQueue, noinline onEvent: (Event) -> Unit) {
    eventQueue.collect(lifecycleScope, onEvent)
}

@Suppress("NOTHING_TO_INLINE")
public inline fun ComponentActivity.collect(
    eventQueue: EventQueue,
    noinline onEvent: (Event) -> Unit,
) {
    eventQueue.collect(lifecycleScope, onEvent)
}
