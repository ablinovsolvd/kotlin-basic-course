package com.solvd.course.module1.chapter3_object_oriented_programming.interfc

import com.solvd.course.module1.chapter3_object_oriented_programming.interfc.service.MovableService
import com.solvd.course.module1.chapter3_object_oriented_programming.interfc.service.impl.AircraftMovableServiceImpl
import com.solvd.course.module1.chapter3_object_oriented_programming.interfc.service.impl.CarMovableServiceImpl

fun main() {
    val carService : MovableService = CarMovableServiceImpl("BMW")
    val aircraftService : MovableService = AircraftMovableServiceImpl("Boeing")

    travel(carService)
    carService.stop()
    travel(aircraftService)
    aircraftService.stop()
}

fun travel(service: MovableService)  {
    service.move()
}

/**
 *
 */
interface Worker {
    fun work()
}

interface Student {
    fun study()
}

class WorkingStudent(val name: String) : Student, Worker {
    override fun study() {
        println("$name is studying")
    }

    override fun work() {
        println("$name is working")
    }
}