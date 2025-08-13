package com.solvd.course.module1

// The `when` expression (switch)
/**
 *
 * when(object) {
 *  value1 -> action1
 *  value2 -> action2
 *  ...
 * }
 *
 */
fun main() {
    unit5task1()
}

// when expression
fun unit5task1() {
    val isEnabled = true;
    when(isEnabled) {
        false -> println("isEnabled off")
        true -> println("isEnabled onn")
    }
}

//using else
fun unit5task2() {
    val a = 30
    when(a) {
        10 -> println("a = 10")
        20 -> println("a = 20")
        else -> println("Unknown value")
    }
}

//Multiple actions for one value
fun unit5task3() {
    var a = 0;
    when(a) {
        10 -> {
            println("a = 10")
            a = a + 1
        }
        11 -> {
            println("a = 11")
            a = a + 2
        }
        else -> {
            println("Unknown value")
        }
    }
    println("a is $a now")
}

//Grouping several values
fun unit5task4() {
    val a = 10;
    when(a) {
        10, 20 -> println("a is 10 or 20")
        else -> println("Unknown value")
    }
}

//Checking ranges
fun unit5task5() {
    val a = 10
    when(a) {
        in 10..19 -> println("a=$a is between 10 and 19") // [10, 19]
        in 20 .. 29 -> println("a=$a is between 20 and 29") // [20, 29]
        !in 10 .. 19 -> println("a=$a is NOT between 10 and 20") //![10, 19]
    }
}

//Returning value
fun unit5task6() {
    val day = 1;
    val dayOfWeek = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        else -> "Unknown"
    }

    val flag : Boolean = when(day) {
        1 -> true
        2 -> false
        else -> false
    }

    println(flag)
}

//Dynamic values and calculations
fun unit5task7() {
    val a = 10
    val b = 21

    when(a + b) {
        20 -> println("a + b = 20")
        30 -> println("a + b = 30")
        else -> println("Undefined")
    }
}





















