package com.andross.utitlities.delegates

import kotlinx.coroutines.flow.MutableStateFlow
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

public operator fun <T : Any> MutableStateFlow<T>.provideDelegate(
    thisRef: Any?,
    property: KProperty<*>,
): ReadWriteProperty<Any?, T> {
    return object : ReadWriteProperty<Any?, T> {

        override fun getValue(thisRef: Any?, property: KProperty<*>): T {
            return this@provideDelegate.value
        }

        override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
            this@provideDelegate.value = value
        }
    }
}
