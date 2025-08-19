package com.solvd.course.module1.chapter2_functional_programming

fun main() {
    val a = sum(4, 3)
    val b = sum(5, 6)
    val c = sum(6, 9)

    //printing(a, b, c)

    checkAge(-1)
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printing(vararg result: Int): Unit {
    for (r in result) {
        print("$r \t")
    }
}

fun checkAge(age: Int): Unit {
    if(age < 0 || age > 110) {
        println("Invalid age")
        return
    }
    println("Age is valid")
}