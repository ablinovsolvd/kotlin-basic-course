package com.solvd.course.module2.util

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun divide(a: Int, b: Int): Int {
        if (b == 0) throw IllegalArgumentException("Division by zero")
        return a / b
    }
}