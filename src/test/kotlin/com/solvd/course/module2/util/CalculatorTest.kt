package com.solvd.course.module2.util

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {
    private val mockCalculator = Calculator()

    @Test
    fun testAddition() {
        val result = mockCalculator.add(1, 14)
        val expected = 15

        assertEquals(expected, result, "Result {$result} is not $expected")
    }
}