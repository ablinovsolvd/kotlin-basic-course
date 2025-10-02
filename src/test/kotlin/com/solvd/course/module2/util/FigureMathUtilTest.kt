package com.solvd.course.module2.util

import com.solvd.course.module2.entity.Square
import com.solvd.course.module2.entity.Triangle
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class FigureMathUtilTest {
    private val  util = FigureMathUtil()

    /** Test area and perimeter of a square with side 5 */
    @Test
    fun testSquareAreaPerimeter() {
        val side = 5.0
        val square = Square(side)

        val resultArea = util.getArea(square)
        val resultPerimeter = util.getPerimeter(square)

        val expectedArea = 25.0
        val expectedPerimeter = 20.0
        assertEquals(expectedArea, resultArea)
        assertEquals(expectedPerimeter, resultPerimeter)
    }

    /** Test area and perimeter of a triangle with side 5 */
    @Test
    fun testTriangleAreaPerimeter() {
        val triangle = Triangle(3.0, 4.0, 5.0)
        assertEquals(6.0, util.getArea(triangle))
        assertEquals(12.0, util.getPerimeter(triangle))
    }

    /** Invalid square with negative side */
    @Test
    fun testInvalidSquare() {
        assertThrows<IllegalArgumentException> {
            val square = Square(-5.0)
        }
    }
}


















