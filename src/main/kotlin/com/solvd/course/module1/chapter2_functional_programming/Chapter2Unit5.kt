package com.solvd.course.module1.chapter2_functional_programming

//Function Overloading
fun main() {
    val a = summary(1, 2.0) // Uses Double
    println(a)
}

fun summary(a: Int, b: Double) = a + b

fun summary(a: Int, b: Int) = a + b

fun summary(a: Double, b: Double) = a + b

fun summary(a: Int, b: Int, c: Int) = a + b + c