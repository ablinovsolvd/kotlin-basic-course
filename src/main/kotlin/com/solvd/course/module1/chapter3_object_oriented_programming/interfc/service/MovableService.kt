package com.solvd.course.module1.chapter3_object_oriented_programming.interfc.service

interface MovableService {
    var speed: Int
    val model: String

    fun move()

    fun stop() {
        println("Stopping...")
    }
}