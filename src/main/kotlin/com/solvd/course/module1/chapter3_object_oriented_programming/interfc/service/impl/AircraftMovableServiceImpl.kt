package com.solvd.course.module1.chapter3_object_oriented_programming.interfc.service.impl

import com.solvd.course.module1.chapter3_object_oriented_programming.interfc.service.MovableService

class AircraftMovableServiceImpl(
    override val model: String
) : MovableService {
    override var speed: Int = 500

    override fun move() {
        println("Flying the aircraft - $model at $speed km/h")
    }

    override fun stop() {
        println("Landing...")
    }
}