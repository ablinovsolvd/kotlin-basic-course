package com.solvd.course.module1

// Ranges
fun main() {
    val range = 1 .. 5
    val charRange = 'a' .. 'j'
    val stringRange = "a" .. "d"

    for (char in charRange) {
        //print("$char \t")
    }

    unit7task4()
}

//Ranges in reverse order
fun unit7task1() {
    val range1 = 1..5
    val range2 = 5 downTo 1

    for (r in range2) {
        print("$r \t")
    }
}

//Ranges with step
fun unit7task2() {
    val range1 = 1..10 step 2       // 1 3 5 7 9
    val range2 = 10 downTo 1 step 3 // 10 7 4 1

    for (r in range2) {
        print("$r \t")
    }
}

//Ranges without the end value
fun unit7task3() {
    val range1 = 1 until 9        // 1 3 5 7 9
    val range2 = 1 until 9 step 2 // 1 3 5 7

    for (r in range1) {
        print("$r \t")
    }
}

//Checking if a value is in a range
fun unit7task4() {
    val range = 1..5

    val isInRange: Boolean = 5 in range // true
    val notInRange: Boolean = -1 in range // false

    println(isInRange)
    println(notInRange)
}
