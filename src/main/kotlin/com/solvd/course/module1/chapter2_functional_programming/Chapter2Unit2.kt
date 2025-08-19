package com.solvd.course.module1.chapter2_functional_programming

// Vararg

fun main() {
    //printStrings("Tom", "Bob", "Sam")
    //printStrings("Kotlin", "Java", "JavaScript", "C#", "C++", "Pyton", "etc")
    var result = sum(1, 2, 3, 4, 5)
    println(result)

    result = sum(132, 2434, -3, 4, 50)
    println(result)

    printUserGroup("Math-012", "Tom", "Bob", "Sam", count = 3)
}

fun printUserGroup(group: String, vararg users: String, count: Int) {
    println("Group: $group")
    println("Count: $count")
    for (user in users) {
        println(user)
    }
}

fun printStrings(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

fun sum(vararg numbers: Int): Int {
    var result = 0;
    for (number in numbers) {
        result += number
    }
    return result
}