package com.andross.utitlities.lifecycle

import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.util.*

class EventQueue {

    private val sharedFlow = MutableSharedFlow<Queue<Event>>(
        replay = 1,
        extraBufferCapacity = 0,
        onBufferOverflow = BufferOverflow.SUSPEND,
    )

    fun offerEvent(coroutineScope: CoroutineScope, event: Event) {
        val queue = sharedFlow.replayCache.firstOrNull() ?: LinkedList()
        queue.add(event)
        coroutineScope.launch { sharedFlow.emit(value = queue) }
    }

    fun collect(coroutineScope: LifecycleCoroutineScope, onEvent: (Event) -> Unit) {
        coroutineScope.launchWhenStarted {
            sharedFlow.collect { events -> consumeEvents(events, onEvent) }
        }
    }

    private inline fun consumeEvents(events: Queue<Event>, consumeEvent: (Event) -> Unit) {
        while (events.isNotEmpty()) consumeEvent(events.remove())
    }
}

interface Event

@Suppress("NOTHING_TO_INLINE")
inline fun Fragment.collect(eventQueue: EventQueue, noinline onEvent: (Event) -> Unit) {
    eventQueue.collect(viewLifecycleOwner.lifecycleScope, onEvent)
}

@Suppress("NOTHING_TO_INLINE")
inline fun ComponentActivity.collect(eventQueue: EventQueue, noinline onEvent: (Event) -> Unit) {
    eventQueue.collect(lifecycleScope, onEvent)
}
