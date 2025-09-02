# Practice Tasks & Solutions: Advanced Functional Programming Units

---

## Function Type

### Task 1
**Create a function called `greet` that prints "Hello!" and assign it to a variable. Call the function using the variable.**

**Solution:**
```kotlin
fun greet() {
    println("Hello!")
}
val greeting: () -> Unit = ::greet
greeting()
```

---

### Task 2
**Define a function called `multiply` that takes two `Int` parameters and returns their product. Assign it to a variable of function type and call it with values 4 and 5.**

**Solution:**
```kotlin
fun multiply(a: Int, b: Int): Int {
    return a * b
}
val op: (Int, Int) -> Int = ::multiply
println(op(4, 5)) // Output: 20
```

---

### Task 3
**Write a function called `subtract` that takes two `Int` parameters and returns their difference. Create a variable that can hold either `multiply` or `subtract`, and switch between them. Show the result for both operations.**

**Solution:**
```kotlin
fun subtract(a: Int, b: Int): Int {
    return a - b
}
var op: (Int, Int) -> Int = ::multiply
println(op(6, 2)) // Output: 12
op = ::subtract
println(op(6, 2)) // Output: 4
```

---

## High Order Functions

### Task 1
**Write a function called `operate` that takes two `Int` numbers and a function as parameters. The function parameter should take two `Int`s and return an `Int`. Use `operate` to add, subtract, and multiply numbers.**

**Solution:**
```kotlin
fun operate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}
fun add(a: Int, b: Int) = a + b
fun subtract(a: Int, b: Int) = a - b
fun multiply(a: Int, b: Int) = a * b

println(operate(5, 3, ::add))      // 8
println(operate(5, 3, ::subtract)) // 2
println(operate(5, 3, ::multiply)) // 15
```

---

### Task 2
**Create a function called `chooseGreeting` that returns a function. If you pass in `true`, it should return a function that prints "Good Morning". If you pass in `false`, it should return a function that prints "Good Night". Show how to call the returned function.**

**Solution:**
```kotlin
fun chooseGreeting(isMorning: Boolean): () -> Unit {
    return if (isMorning) {
        fun() { println("Good Morning") }
    } else {
        fun() { println("Good Night") }
    }
}
val morningGreeting = chooseGreeting(true)
morningGreeting() // Output: Good Morning
val nightGreeting = chooseGreeting(false)
nightGreeting() // Output: Good Night
```

---

### Task 3
**Write a function called `repeatAction` that takes a function with no parameters and repeats it 3 times.**

**Solution:**
```kotlin
fun repeatAction(action: () -> Unit) {
    repeat(3) { action() }
}
val sayHi = { println("Hi!") }
repeatAction(sayHi)
// Output: Hi! Hi! Hi!
```

---

## Anonymous Functions

### Task 1
**Create an anonymous function that adds two `Int` numbers. Assign it to a variable and call it with 7 and 3.**

**Solution:**
```kotlin
val add = fun(a: Int, b: Int): Int = a + b
println(add(7, 3)) // Output: 10
```

---

### Task 2
**Pass an anonymous function to a function called `doMath` that multiplies two numbers. `doMath` should take two `Int`s and a function, and return the result.**

**Solution:**
```kotlin
fun doMath(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}
println(doMath(4, 5, fun(x: Int, y: Int): Int = x * y)) // Output: 20
```

---

### Task 3
**Write a function called `getAnonymous` that returns an anonymous function which subtracts one number from another.**

**Solution:**
```kotlin
fun getAnonymous(): (Int, Int) -> Int {
    return fun(a: Int, b: Int): Int = a - b
}
val sub = getAnonymous()
println(sub(10, 4)) // Output: 6
```

---

## Lambda Expressions

### Task 1
**Create a lambda that prints "Hello from Lambda!" and call it.**

**Solution:**
```kotlin
val greetLambda = { println("Hello from Lambda!") }
greetLambda()
```

---

### Task 2
**Write a lambda that takes a `String` and prints it in upper case. Call the lambda with the word "kotlin".**

**Solution:**
```kotlin
val upperPrinter = { text: String -> println(text.uppercase()) }
upperPrinter("kotlin") // Output: KOTLIN
```

---

### Task 3
**Write a function called `applyOperation` that takes two `Int`s and a lambda, and returns the result. Use this function to add, subtract, and multiply numbers with different lambdas.**

**Solution:**
```kotlin
fun applyOperation(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}
println(applyOperation(5, 3, { x, y -> x + y })) // 8
println(applyOperation(5, 3, { x, y -> x - y })) // 2
println(applyOperation(5, 3, { x, y -> x * y })) // 15
```

---