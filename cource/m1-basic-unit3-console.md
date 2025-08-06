# Console Input and Output

## Printing to the Console

To show information on the screen, Kotlin has two built-in functions:

- `print()`
- `println()`

Both can display text or data.  
The difference is that `println()` adds a new line after printing, while `print()` does not.

**Example:**

```kotlin
fun main() {
    print("Hello ")
    print("Kotlin ")
    print("on Metanit.com")
    println()              // just moves to a new line
    println("Kotlin is fun")
}
```

**Console output:**
```
Hello Kotlin on Metanit.com
Kotlin is fun
```

You can use `println()` with no arguments to simply move to a new line.

## Reading Input from the Console

To get user input, use the built-in function `readLine()`.  
It always returns a value of type `String`.

**Example:**

```kotlin
fun main() {
    print("Enter your name: ")
    val name = readLine()    // gets a line from the user
    println("Your name is: $name")
}
```

When you run this program, it will ask for your name, and then display it.

**Sample output:**
```
Enter your name: Eugene
Your name is: Eugene
```

You can ask for several pieces of information in one program:

```kotlin
fun main() {
    print("Enter your name: ")
    val name = readLine()
    print("Enter your email: ")
    val email = readLine()
    print("Enter your address: ")
    val address = readLine()

    println("Your name: $name")
    println("Your email: $email")
    println("Your address: $address")
}
```

**Sample output:**
```
Enter your name: Eugene
Enter your email: myemail@mail.com
Enter your address: 123 Main Street

Your name: Eugene
Your email: myemail@mail.com
Your address: 123 Main Street
```

---

That's all you need to know to start working with console input and output in Kotlin!