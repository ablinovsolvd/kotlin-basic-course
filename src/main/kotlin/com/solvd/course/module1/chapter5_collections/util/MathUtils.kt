package com.solvd.course.module1.chapter5_collections.util

/**
 * Create a class called MathUtils.
 * Add a function that takes a list of integers and returns the sum of all even numbers in the list.
 */
class MathUtils {
    // 4 / 2 = 2       (4 % 2 = 0)
    // 3 / 2 = 1.5     (3 % 2 = 1)
    fun sumOfEvens(numbers: List<Int>): Int {
        return numbers.filter { it % 2 == 0 }.sum()
    }
}