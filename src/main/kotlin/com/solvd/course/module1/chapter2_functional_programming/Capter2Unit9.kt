package com.solvd.course.module1.chapter2_functional_programming

/**
 * Lambda expressions
 */
// { println("Hello") }
fun main() {
   val hello = { println("Hello") }
   hello() // () -> Unit

   val printer = { message: String -> println(message) }
   printer("Hello Artyom")

   val sum = { x: Int, y: Int ->
      val result = x + y
      result
   }
   val result = sum(100, 150)
   println(result)
}