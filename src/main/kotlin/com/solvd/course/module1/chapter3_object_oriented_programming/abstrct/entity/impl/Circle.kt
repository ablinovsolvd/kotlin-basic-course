package com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.impl

import com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.Figure

class Circle(
    override val name: String,
    val diameter: Float
) : Figure() {
    override fun perimeter(): Float {
        TODO("Not yet implemented")
    }

    override fun area(): Float {
        TODO("Not yet implemented")
    }
}