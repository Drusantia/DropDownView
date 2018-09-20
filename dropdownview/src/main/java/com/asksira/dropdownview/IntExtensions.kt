package com.asksira.dropdownview

import android.content.res.Resources
import android.util.TypedValue

fun Int.dp(): Int = TypedValue
    .applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        toFloat(),
        Resources.getSystem().displayMetrics)
    .toInt()