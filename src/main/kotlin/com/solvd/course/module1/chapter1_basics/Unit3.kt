package com.solvd.course.module1.chapter1_basics

fun main() {
    print("Hello ")
    print("Kotlin ")
    print("on Courses")
    println()              // just moves to a new line
    println("Kotlin is fun")
}

fun unit3task1() {
    print("Enter your name: ")
    val name = readLine()    // gets a line from the user
    println("Your name is: $name")
}

fun unit3task2() {
    print("Enter your name: ")
    val name = readLine()
    print("Enter your email: ")
    val email = readLine()
    print("Enter your address: ")
    val address = readLine()

    println("Your name: $name")
    println("Your email: $email")
    println("Your address: $address")
}