package com.solvd.course.module1.chapter3_object_oriented_programming.social

fun main() {
    val user1 = User("Alice", 11, "Alice123")
    user1.sendMessage()
    //user1.age = 11
    println(user1.age)

    println("Is ${user1._nickname} a teen? ${user1.isTeen}")
}