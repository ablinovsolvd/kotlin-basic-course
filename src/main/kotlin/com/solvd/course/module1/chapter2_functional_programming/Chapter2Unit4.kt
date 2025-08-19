package com.solvd.course.module1.chapter2_functional_programming

/**
 * Single-expression function
 * fun functionName(params) = expression
 */
fun main() {
    val a = square(5)
    val b = square(6)
    println("a=$a b=$b")

    compareAge(5, 5)
}

fun square(x: Int) = x * x

//local (nested) functions
fun compareAge(ageOne: Int, ageTwo: Int) {
    fun ageIsValid(age: Int): Boolean {
        return age in 1..100
    }

    fun square(x: Int) = x * x

    if(!ageIsValid(ageOne) || !ageIsValid(ageTwo)) {
        println("Invalid age")
        return
    }

    when {
        ageOne == ageTwo -> println("ageOne == ageTwo")
        ageOne > ageTwo -> println("ageOne > ageTwo")
        ageOne < ageTwo -> println("ageOne < ageTwo")
    }
}