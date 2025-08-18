package com.solvd.course.module1.chapter1_basics

/**
 * Unit 4: If .. else conditionals
 */
fun main() {
    unit4task1()
}

// if statement
fun unit4task1() {
    val a = 11
    if (a == 10) {
        println("It's true")
    }
}

// if...else statement
fun unit4task2() {
    val a = 5
    if (a == 10) {
        println("It's true")
    } else {
        println("a does NOT equal 10")
    }
}

// multiple options (else if)
fun unit4task3() {
    val a = 0
    if (a == 10) {
        println("a equals 10")
    } else if (a == 11) {
        println("a equals 11")
    } else {
        println("a has an unknown value")
    }
}

// returning a value grom if
fun unit4task4() {
    val a = 10
    val b = 20
    val c = if (a > b) a else b
    println(c) // 20
}
