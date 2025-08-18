package com.solvd.course.module1.chapter1_basics

fun main() {
    val a = 10
    val b = 5
    val sum = a + b         // 15
    val diff = a - b        // 5
    val product = a * b     // 50
    val quotient = a / b    // 2
    val remainder = a % b   // 0

    var score = 10
    score += 5              // 15
    score -= 3              // 12

    val isGreater = a > b   // true
    val isEqual = a == b    // false

    var count = 1
    count++                 // 2
    count--                 // 1

    val isAdult = true
    val hasTicket = false
    val canEnter = isAdult && hasTicket  // false
    val notAllowed = !canEnter           // true
}
