package com.solvd.course.module1.chapter3_object_oriented_programming.enumerations

import com.solvd.course.module1.chapter3_object_oriented_programming.enumerations.entity.Operation
import com.solvd.course.module1.chapter3_object_oriented_programming.enumerations.util.OperationUtil

fun main() {
    val day: Day = Day.FRIDAY
    val duration: Int = day.getDuration(Day.MONDAY)

    for (day in Day.values()) {
        //println(day)
    }
    //println(Day.valueOf("FRIDAY"))

    val operationUtil = OperationUtil()
    println(operationUtil.operate(5, 2, Operation.MULTIPLY))
}

/**
 * prop: name
 * prop: ordinal
 *
 * fun: valueOf(value: String)
 * fun: values()
 */
enum class Day(val position: Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun getDuration(day: Day): Int {
        return position - day.position
    }
}