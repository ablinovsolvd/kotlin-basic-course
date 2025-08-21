package com.solvd.course.module1.chapter2_functional_programming

/**
 * Function type in Kotlin
 */
//format
//(parameterTypes) -> returnType
fun main() {
    val message: () -> Unit = ::helloWorld
    message()

    var operation: (Int, Int) -> Int = ::additionOfTwoNumber
    val result1 = operation(1, 3)
    println(result1) //4

    operation = ::subtract
    val result2 = operation(1, 3)
    println(result2) //-2
}

// () -> Unit
fun helloWorld(): Unit {
    println("Hello World!")
}

// (Int, Int) -> Int
fun additionOfTwoNumber(a: Int, b: Int): Int {
    return a + b
}

// (Int, Int) -> Int
fun subtract(a: Int, b: Int): Int {
    return a - b
}