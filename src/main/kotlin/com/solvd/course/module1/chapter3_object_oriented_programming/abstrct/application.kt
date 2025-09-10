package com.solvd.course.module1.chapter3_object_oriented_programming.abstrct

import com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.Figure
import com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.Human
import com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.impl.Circle
import com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.impl.Person
import com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.impl.Rectangle

fun main() {
    val kate: Person = Person("Kate", 19)
    val alice: Human = Person("Alice", 20)
    kate.hello()
    alice.hello()

    val service = FigureService()
    val rectangle: Figure = Rectangle("Rectangle",2F, 3F)
    val circle: Figure = Circle("Circle",3F)

    service.info(rectangle)
    service.info(circle)
}

class FigureService {
    fun info(figure: Figure) {
        println(figure.name)
    }
}