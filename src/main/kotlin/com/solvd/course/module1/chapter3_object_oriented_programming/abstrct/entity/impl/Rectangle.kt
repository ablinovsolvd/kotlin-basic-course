package com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.impl

import com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.Figure

class Rectangle(
    override var name: String,
    val width: Float,
    val height: Float
) : Figure() {
    override fun perimeter(): Float {
        return width * 2 + height * 2
    }

    override fun area(): Float {
        return width * height
    }

    fun info() {
        println("info")
    }
}