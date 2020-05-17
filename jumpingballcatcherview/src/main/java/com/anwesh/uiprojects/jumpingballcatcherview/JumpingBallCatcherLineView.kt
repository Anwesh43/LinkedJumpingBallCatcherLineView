package com.anwesh.uiprojects.jumpingballcatcherview

/**
 * Created by anweshmishra on 18/05/20.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.app.Activity
import android.content.Context

val nodes : Int = 5
val lines : Int = 2
val parts : Int = 3
val scGap : Float = 0.02f / (parts - 1)
val strokeFactor : Float = 90f
val sizeFactor : Float = 4f
val colors : Array<String> = arrayOf("#673AB7", "#4CAF50", "#F44336", "#3F51B5", "#009688")
val backColor : Int = Color.parseColor("#BDBDBD")
val delay : Long = 20
