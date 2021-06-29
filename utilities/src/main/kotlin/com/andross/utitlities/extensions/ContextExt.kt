package com.andross.utitlities.extensions

import android.content.Context

fun Context.dpToPx(dp: Int): Float {
    return dp.toFloat() * resources.displayMetrics.density
}

fun Context.pxToDp(px: Int): Float {
    return px.toFloat() / resources.displayMetrics.density
}
