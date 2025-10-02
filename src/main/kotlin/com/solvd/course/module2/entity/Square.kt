package com.solvd.course.module2.entity

class Square(private val side: Double): Figure() {
    init {
        require(side > 0) { "Side length must be positive" }
    }

    override fun area(): Double {
        return side * side
    }

    override fun perimeter(): Double {
        return 4 * side
    }
}