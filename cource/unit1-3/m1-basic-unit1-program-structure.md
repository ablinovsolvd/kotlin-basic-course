# Program Structure and Basic Syntax

## Installing the Java Development Kit (JDK)

Kotlin runs on the Java Virtual Machine (JVM). To use Kotlin, you need to install the Java Development Kit (JDK).  
You can download the JDK from Oracle’s official website or from providers like OpenJDK.  
After installation, it’s helpful to set the `JAVA_HOME` environment variable to point to your JDK folder.

## Setting up IntelliJ IDEA

The most popular environment for Kotlin is IntelliJ IDEA, made by JetBrains.  
You can download the free Community Edition from JetBrains’ website.  
The Kotlin plugin is included and enabled by default.

To create a new Kotlin project in IntelliJ IDEA:
1. Open IntelliJ IDEA and click “New Project”.
2. Select “Kotlin” on the left.
3. Name your project and choose a location.
4. Choose a build system (IntelliJ or Gradle).
5. Select the JDK you installed.

## Writing and Running Your First "Hello, World!" Program

Once your project is ready, you can write your first Kotlin program.

1. In your project, create a new Kotlin file (for example, `HelloWorld.kt`).
2. Add the following code:

```kotlin
fun main() {
    println("Hello, World!")
}
```

The `main` function is where every Kotlin program starts.  
To run the program, click the green play button next to the `main` function.  
You will see “Hello, World!” printed at the bottom of your screen.

## Structure of a Kotlin Program

The entry point for every Kotlin program is the `main` function.  
Here's a simple example:

```kotlin
fun main() {
    println("Hello, Kotlin!")
}
```

- `fun` means “function”.
- `main` is the name of the function.
- Parentheses after `main` are for parameters (here, there are none).
- The code inside `{}` is what runs.

Before Kotlin version 1.3, the `main` function could take parameters:

```kotlin
fun main(args: Array<String>) {
    println("Hello, Kotlin!")
}
```

Now, using parameters is optional.

## Statements and Code Blocks

A statement is a single action, like calling a function or assigning a value.

```kotlin
println("Hello!")
```

You don’t need to put a semicolon at the end of every line (unlike Java):

```kotlin
fun main() {
    println("First line")
    println("Second line")
}
```

But if you write several statements on one line, separate them with semicolons:

```kotlin
fun main() {
    println("First"); println("Second")
}
```

## Comments

Comments help explain your code. Kotlin supports:

- **Single-line comments:** Start with `//`

```kotlin
// This is a single-line comment
```

- **Multi-line comments:** Start with `/*` and end with `*/`

```kotlin
/*
This is a multi-line comment.
It can span several lines.
*/
```

- **Documentation comments (KDoc):** Start with `/**` and end with `*/`. Used for generating documentation.

## Variables and Data Types (`val` vs. `var`)

You declare variables using `val` and `var`:

- `val`: For values that do not change (like constants).

    ```kotlin
    val name: String = "John"
    // name = "Jane" // This will cause an error
    ```

- `var`: For values that can change.

    ```kotlin
    var age: Int = 30
    age = 31 // This is allowed
    ```

Kotlin can often guess the type of your variable from the value you assign, so you can skip writing the type:

```kotlin
val city = "London" // Kotlin knows this is a String
```

## Basic Operators

Kotlin supports these main operators:

### Arithmetic Operators

- `+` Addition: `val sum = 2 + 3` // 5
- `-` Subtraction: `val diff = 5 - 2` // 3
- `*` Multiplication: `val product = 4 * 2` // 8
- `/` Division: `val quotient = 10 / 2` // 5
- `%` Remainder: `val remainder = 7 % 3` // 1

### Assignment Operators

- `=` Assign: `var score = 10`
- `+=` Add and assign: `score += 5` // 15
- `-=` Subtract and assign: `score -= 3` // 12
- `*=` Multiply and assign: `score *= 2` // 24
- `/=` Divide and assign: `score /= 4` // 6
- `%=` Remainder and assign: `score %= 4` // 2

### Comparison Operators

- `==` Equal: `a == b`
- `!=` Not equal: `a != b`
- `>` Greater: `a > b`
- `<` Less: `a < b`
- `>=` Greater or equal: `a >= b`
- `<=` Less or equal: `a <= b`

### Logical Operators

- `&&` And: `condition1 && condition2`
- `||` Or: `condition1 || condition2`
- `!` Not: `!condition`

### Increment/Decrement

- `++` Increase by one: `count++`
- `--` Decrease by one: `count--`

**Examples:**

```kotlin
val a = 10
val b = 5
val sum = a + b         // 15
val diff = a - b        // 5
val product = a * b     // 50
val quotient = a / b    // 2
val remainder = a % b   // 0

var score = 10
score += 5              // 15
score -= 3              // 12

val isGreater = a > b   // true
val isEqual = a == b    // false

var count = 1
count++                 // 2
count--                 // 1

val isAdult = true
val hasTicket = false
val canEnter = isAdult && hasTicket  // false
val notAllowed = !canEnter           // true
```

---

This chapter showed you how to set up Kotlin, write simple code, and use variables, comments, and basic operations.  
You are ready to move on and learn more about data types and language features!