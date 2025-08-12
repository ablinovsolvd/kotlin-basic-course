# Introduction

On our last lesson, we learned about how a Kotlin program is structured and what data types exist.  
We saw how to create variables and work with numbers, text, and Boolean values.

---

In this lesson, we will move forward and learn some very important building blocks of programming:

- **Conditional statements** (`if`, `else`, and `when`) — let your code make decisions and choose different actions based on conditions.
- **Loops** (`for`, `while`, `do...while`) — allow your program to repeat actions many times.
- **Ranges** — help us work with sequences of values (like numbers from 1 to 10).
- **Arrays** — let us store and work with lists of values, such as a group of numbers or names.

---

These topics are the foundation for writing real programs.  
They help your code:

- Make decisions (“What should I do if this is true?”)
- Repeat actions (“Do this for every item in a list”)
- Store and manage many values together

Once you understand these concepts, you’ll be able to solve much more interesting tasks and write more powerful programs.  
Let’s get started!

---

## Before we begin: what is a function?

Before we dive in, let’s quickly talk about **functions**.

A **function** is a named block of code that you can run (or "call") whenever you want.  
Functions help us split the program into small, clear pieces.  
We will learn about functions in detail later, but for now, we will use them to make our examples cleaner and easier to understand.

Here’s a simple example of how to make and call functions in Kotlin:

```kotlin
// This is a function that prints a greeting
fun greet() {
    println("Hello from the greet function!")
}

// This is a function that prints a farewell
fun sayBye() {
    println("Goodbye from the sayBye function!")
}

// This is the main function where the program starts
fun main() {
    greet()      // call (run) the greet function
    sayBye()     // call (run) the sayBye function
}
```

**What happens here?**
- We define two functions: `greet` and `sayBye`.
- In the `main` function, we "call" these functions by writing their names with `()`.
- When you run the program, it will print messages from both functions.

Using functions makes your code easier to read and reuse.  
Don’t worry if this is new — we’ll practice together!

---