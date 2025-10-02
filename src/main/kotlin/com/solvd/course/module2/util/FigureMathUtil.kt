package com.solvd.course.module2.util

import com.solvd.course.module2.entity.Figure

class FigureMathUtil {
    fun getArea(figure: Figure): Double {
        return figure.area()
    }

    fun getPerimeter(figure: Figure): Double {
        return figure.perimeter()
    }
}