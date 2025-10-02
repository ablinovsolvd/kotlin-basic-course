package com.solvd.course.module2.entity

import kotlin.math.sqrt

/**
 * Step 1: Calculate the semi-perimeter (s) by adding the lengths of the three sides and dividing by two: s = (a + b + c) / 2.
 * Step 2: Apply Heron's Formula to find the area (A): A = √[s(s-a)(s-b)(s-c)].
 */
class Triangle(private val a: Double,
               private val b: Double,
               private val c: Double): Figure() {
    override fun area(): Double {
        val s = perimeter() / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }

    override fun perimeter(): Double {
        return a + b + c
    }
}