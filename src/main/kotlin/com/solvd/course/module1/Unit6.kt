package com.solvd.course.module1

// Loops
/**
     //Basic form:
     for (variable in sequence) {
      // instructions to repeat
     }
 */
fun main() {
    unit6task6()
}

// `for` loop
fun unit6task1() {
    //1 2 3 4 5
    //for (int i = 0; i < array.size(); i++)
    for (i in 1..9) {
        print("${i * i} \t")
    }
}

/**
    Simple Matrix with coordinates (row, column)
    _____________________________________________
    1(0,0)      2(0,1)      3(0,2)
    2(1,0)      4(1,1)      6(1,2)
    3(2,0)      6(2,1)      9(2,2)
 */
fun unit6task2() {
    val rangeOfNumbers = 1 .. 9
    for (i in rangeOfNumbers) {
        for (j in rangeOfNumbers) {
            print("${i * j} \t")
        }
        println()
    }
}

fun unit6task3() {
    val fruits = arrayOf("apple", "banana", "orange")
    for (fruit in fruits) {
        println(fruit)
    }
}

// `while` loop
fun unit6task4() {
    var i  = 10
    while (i > 0) {
        println("i=$i")
        i--
    }
}

// `do while` loop
fun unit6task5() {
    var i = -1;
    do {
        println("i=$i")
        i--
    } while (i > 0)
}

// `continue` and `break` in loops
fun unit6task6() {
    //continue
    println("continue:")
    for (i in 1..9) {
        if (i == 5) {
            continue
        }
        print("i=$i \t")
    }

    //break
    println("\nbreak:")
    for (i in 1..9) {
        if (i == 5) {
            break
        }
        print("i=$i \t")
    }
}















