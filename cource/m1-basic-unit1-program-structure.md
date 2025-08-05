# Program Structure
_Last updated: 02.03.2024_

## The `main` Function

The entry point of a Kotlin program is the `main` function. This is where the execution of a Kotlin program begins, so every Kotlin program must have this function.

For example, the following `main` function was defined:

```kotlin
fun main() {
    println("Hello Kotlin")
}
```

The definition of the `main()` function (as well as other functions in Kotlin) starts with the keyword `fun`. This keyword indicates that a function is being defined. After `fun`, the name of the function is specified; in this case, it's `main`.

Following the function name, there are parentheses containing the function's parameters. Here, the `main` function does not take any parameters, so the parentheses are empty.

All actions that the function performs are enclosed in curly braces. In this example, the only thing the `main` function does is print a message to the console using the built-in `println()` function.

It is worth noting that prior to version 1.3, the `main` function in Kotlin had to accept parameters:

```kotlin
fun main(args: Array<String>) {
    println("Hello Kotlin")
}
```

The `args: Array<String>` parameter represents an array of strings through which data can be passed into the program.

Starting with version 1.3, it is no longer mandatory to define the `main` function with parameters, although you may still use this definition if needed.

## Statements and Code Blocks

The fundamental building block of a Kotlin program is the statement. Each statement performs a specific action, such as calling functions, declaring variables, or assigning values. For example:

```kotlin
println("Hello Kotlin!");
```

This line calls the built-in `println()` function, which prints a message (in this case, the string `"Hello Kotlin!"`) to the console.

Unlike some other similar programming languages, such as Java, it is not necessary to put a semicolon at the end of each statement in Kotlin. Each statement can simply be placed on a new line:

```kotlin
fun main() {
    println("Kotlin courses")
    println("Hello Kotlin!")
    println("Kotlin is a fun")
}
```

However, if you place multiple statements on a single line, you need to separate them with a semicolon:

```kotlin
fun main() {
    println("Kotlin courses"); println("Hello Kotlin!"); println("Kotlin is a fun")
}
```

## Comments

Source code can contain comments. Comments help explain the meaning of the program and what certain parts do. Comments are ignored during compilation and have no effect on the application's behavior or its size.

Kotlin supports two types of comments: single-line and multi-line. A single-line comment is placed on a line after two slashes `//`. A multi-line comment is enclosed between `/*` and `*/`, and can span multiple lines. For example:

```kotlin
/*
    Multi-line comment
    The main function -
    the entry point of the program
*/
fun main() {         // start of the main function
    println("Hello Kotlin!") // print a line to the console
}                   // end of the main function
```
