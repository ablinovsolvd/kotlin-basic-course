package com.solvd.course.module1.unit2

/**
 * @author Artyom
 */
fun main() {
    val x = 10
    val y = 5
    val z = 3
    println("x = $x")
    println("y = $y")
    println("z = $z")
    when (x) {
        y - z -> println("x = y - z")
        y + 5 -> println("x = y + 5")
        else -> println("Unknown value")
    }
}
