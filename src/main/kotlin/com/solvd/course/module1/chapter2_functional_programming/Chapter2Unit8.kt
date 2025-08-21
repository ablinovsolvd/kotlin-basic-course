package com.solvd.course.module1.chapter2_functional_programming

fun main() {
    val message = fun() = println("Hello")
    message()

    val sum = fun(x: Int, y: Int): Int = x + y
    println(sum(15, 5))

    doOperation(9, 5, fun(x: Int, y: Int): Int = x + y) //14
    doOperation(9, 5, fun(x: Int, y: Int): Int = x - y) //14

    var action1 = selectActionForOperation(1)
    println(action1(4, 5))
    action1 = selectActionForOperation(2)
    println(action1(4, 5))
}

fun doOperation(x: Int, y: Int, op: (Int, Int) -> Int) {
    println(op(x, y))
}

fun selectActionForOperation(key: Int): (Int, Int) -> Int {
    when(key) {
        1 -> return fun(x: Int, y: Int): Int = x + y
        2 -> return fun(x: Int, y: Int): Int = x - y
        else -> return fun(x: Int, y: Int): Int = 0
    }
}