package com.solvd.course.module1.chapter3_object_oriented_programming.social

/**
 * Create a simple class called User that represents a person on a social media app.
 *
 * The class should have properties for the user's name and age.
 * Use a constructor to set these values when creating a new user.
 * Add a function sendMessage in the class that prints a message like: "Hello from {name}!".
 * Use a package called social for your class.
 * Set up a setter for age so that only ages between 13 and 120 are allowed.
 * Add a computed property called isTeen which returns true if age is between 13 and 19.
 * In your main function:
 *
 * Import the class and create two users with different ages and names.
 * Call the sendMessage function for both users.
 * Print if each user is a teen or not.
 */

class User(val _name: String,
           val _age: Int,
           val _nickname: String
) {
    var age: Int = _age
        set(value) {
            if(value in 13 .. 120) {
                field = value
            }
        }

    val isTeen: Boolean
        get() {
            return age in 13 .. 19
        }

    fun sendMessage() {
        println("Hello from $_name! Your login is $_nickname.")
    }

}