package com.solvd.course.module1.chapter2_functional_programming

import javax.swing.text.Position

/**
        fun functionName(parameters) : ReturnType {
        // instructions (the code to run)
        }
 */
fun main() : Unit {
    val name = "Artyom"
    //printGreeting(name)

    val result = add(5, 9)
    //println(result)

    //displayUser("Bob", 21)
    //displayUser("John", 25, "Manager")
    //displayUser("Kate", position = "Developer", age = 23)

    var numbers = intArrayOf(4, 5, 6)
    for (n in numbers) {
        print("$n \t")
    }
    double(1, numbers)

    for (n in numbers) {
        print("$n \t")
    }
}

fun doubleValue(number: Int) {
    //number = number * 2 //Error!
    println("Value: $number")
}

fun double(position: Int, numbers: IntArray) {
    numbers[position] = numbers[position] * 2
    println("Value: ${numbers[position]}")
}

fun displayUser(name: String, age: Int, position: String = "unemployed") {
    println("Name: $name, age: $age, $position")
}

fun printGreeting(name: String) {
    println("Hello, $name")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

