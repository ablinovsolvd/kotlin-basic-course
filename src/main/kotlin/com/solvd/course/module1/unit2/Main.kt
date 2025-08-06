package com.solvd.course.module1.unit2

/**
 * @author Artyom
 */
fun main() {
    // This is a single-line comment
    //println("Hello, World!")
    //println("Hello, kotlin!")

    // diff (val vs. var)

    //like const


    //var - for values that can change
    var age: Int = 30;
    age = 31;

    /**
     *  Kotlin supports a range of operators for performing various operations:
     *
     *  Arithmetic Operators:** `+`, `-`, `*`, `/`, `%` (modulo)
     *  Assignment Operators:** `=`, `+=`, `-=`, `*=`, `/=`, `%=`
     *  Comparison Operators:** `==` (equality), `!=` (inequality), `>`, `<`, `>=`, `<=`
     *  Logical Operators:** `&&` (and), `||` (or), `!` (not)
     *  Increment and Decrement Operators:** `++`, `--`
     */
    val a = 10;
    val b = 5;
    val c = a + b;

    val isGreater : Boolean = b > a

    val isAdult = true;

    var count = 1;
    count--



    //Numbers

    //Int:
    var number : Int = 31;

    //Long:
    val id : Long = 123456789L;

    //Float:
    val pi: Float = 3.14F;

    //Double:
    val height: Double = 1.78;

    //Boolean
    val isActive: Boolean = true;

    //Char
    val letter: Char = 'A';

    //String
    // ${}
    val firstName: String = "Artyom";
    val lastName: String = "Blinou";
    val welcome: String = "Hello, $firstName $lastName. Age: ${--number}"
    println(welcome)
    println(welcome)

    //Any
    var value: Any = "Text";
    value = 123;

    print("Enter u name: ")
    val name = readLine();
    println("Your name is: $name")















}