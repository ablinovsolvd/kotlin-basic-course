package com.solvd.course.module2.util

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class StringUtilTest {

    /** getText()*/
    @Test
    fun testGetTextLength() {
        val text = "Kotlin"
        val expected = 6
        assertEquals(expected, text.length)
    }

    @Test
    fun testGetTextNotNull() {
        val str: String = "Hello"
        assertNotNull(str)
    }

    @Test
    fun testGetTextThrowsNumberFormatException() {
        val text = "abcdef"
        assertThrows<NumberFormatException> {
            text.toInt()
        }
    }
}