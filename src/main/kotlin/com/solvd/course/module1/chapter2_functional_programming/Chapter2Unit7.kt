package com.solvd.course.module1.chapter2_functional_programming

/**
 * High Order Functions in Kotlin
 */
fun main() {
    //displayMessage(::morning)
    //displayMessage(::evening)

    //action(5, 3, ::subtract)
    //action(11, 9, ::multiply)

    var action1 = selectAction(1)
    println(action1(10, 5))

    action1 = selectAction(100)
    println(action1(10, 5))
}

fun displayMessage(message: () -> Unit) {
    message()
}

fun action(n1: Int, n2: Int, op: (Int, Int) -> Int) {
    val result = op(n1, n2)
    println(result)
}

// () -> Unit
fun morning() {
    println("Good Morning")
}

// () -> Unit
fun evening() {
    println("Good Evening")
}

// (Int, Int) -> Int
fun subtractTwo(a: Int, b: Int): Int {
    return  a - b
}

// (Int, Int) -> Int
fun multiply(a: Int, b: Int): Int {
    return a * b
}

// (Int, Int) -> Int
fun empty(a: Int, b: Int): Int {
    return 0
}

fun selectAction(key: Int): (Int, Int) -> Int {
    when(key) {
        1 -> return ::subtractTwo
        2 -> return ::multiply
        else -> return ::empty
    }
}






















