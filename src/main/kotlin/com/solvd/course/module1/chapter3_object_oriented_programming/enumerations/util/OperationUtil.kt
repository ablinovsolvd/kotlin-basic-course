package com.solvd.course.module1.chapter3_object_oriented_programming.enumerations.util

import com.solvd.course.module1.chapter3_object_oriented_programming.enumerations.entity.Operation

class OperationUtil {
    fun operate(n1: Int, n2: Int, op: Operation): Int {
        return when(op) {
            Operation.ADD -> n1 + n2
            Operation.SUBTRACT -> n1 - n2
            Operation.MULTIPLY -> n1 * n2
        }
    }
}