package com.solvd.course.module1.chapter3_object_oriented_programming.interfc.service.impl

import com.solvd.course.module1.chapter3_object_oriented_programming.interfc.service.MovableService

class CarMovableServiceImpl(
    override val model: String
) : MovableService {
    override var speed: Int = 50

    override fun move() {
        println("Driving the car - $model at $speed km/h")
    }
}