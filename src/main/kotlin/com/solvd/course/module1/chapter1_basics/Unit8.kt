package com.solvd.course.module1.chapter1_basics

/** Introduction to Arrays
 */
fun main() {
    //positions
    // 0  1  2   3   4
    //values
    // 5  2  1  -3  100

    unit8example5()
}

//creating
fun unit8example1() {
    val numbers: Array<Int> = arrayOf(5, 2, -1, 3, 100)
    for (number in numbers) {
        print("$number \t")
    }

    val str = arrayOf("a", "bb", "ccc")
}

//array with repeated values
fun unit8example2() {
    val zeros = Array(5) {0}             // [0, 0, 0, 0, 0]
    val squares = Array(5) {i -> i * i} // [0, 1, 4, 9, 16]
    for (sq in squares) {
        print("$sq \t")
    }
}

//Accessing and changing elements
fun unit8example3() {
    val numbers = arrayOf(10, 20, 30)
    println(numbers[1])
    numbers[2] = 50
    println(numbers[2])
}

//AGetting the size of an array
fun unit8example4() {
    val people = arrayOf("Tom", "Bob", "Sam")
    println(people.size) // 3
}

//Check if an element is in array
fun unit8example5() {
    val colors = arrayOf("red", "green", "blue")
    val checkIsNot = "yellow" in colors
    val check = "red" in colors
    println(checkIsNot)
    println(check)
}