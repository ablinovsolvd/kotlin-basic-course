package com.solvd.course.module1

fun main() {
    task1();
    task2();
}

fun task1() {
    println("Task 1")
}

fun task2() {
    println("Task 2")
    val numbers = Array(3) { 1 }
    println(numbers.contentToString())
    for (i in numbers) {
        print("$i \t")
    }
}