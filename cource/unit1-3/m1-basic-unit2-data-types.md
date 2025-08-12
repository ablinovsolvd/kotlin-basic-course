# Data Types

In Kotlin, every variable and value has a specific data type, which determines how much memory is used and what operations can be performed.

## Basic Data Types

### Numbers

Kotlin supports several numeric types for whole and fractional numbers:

- **Int**: Whole numbers (e.g., `val age: Int = 25`)
- **Long**: Large whole numbers (e.g., `val bigNumber: Long = 123456789L`)
- **Float**: Decimal numbers with lower precision (e.g., `val pi: Float = 3.14F`)
- **Double**: Decimal numbers with higher precision (e.g., `val height: Double = 1.78`)

By default, integer values are `Int`, and decimal values are `Double`. Use suffixes (`L` for `Long`, `F` for `Float`) to specify other types.

```kotlin
val a: Int = 15
val b: Long = 15L
val c: Float = 3.14F
val d: Double = 3.1415
```

### Boolean

`Boolean` type holds either `true` or `false`:

```kotlin
val isActive: Boolean = true
```

### Char

`Char` represents a single character in single quotes:

```kotlin
val letter: Char = 'A'
```

### String

`String` is a sequence of characters in double quotes:

```kotlin
val name: String = "Eugene"
```

Strings can contain special characters like `\n` (newline) and `\t` (tab):

```kotlin
val text: String = "Hello,\nWorld!"
```

For multiline strings, use triple double quotes:

```kotlin
val multiline: String = """
    This is
    a multiline
    string.
"""
```

## String Templates

Kotlin allows you to insert variable values directly into strings using `$`:

```kotlin
val firstName = "Tom"
val lastName = "Smith"
val welcome = "Hello, $firstName $lastName"
println(welcome) // Hello, Tom Smith
```

You can insert any expression inside `${}`:

```kotlin
val age = 22
val info = "Age next year: ${age + 1}"
```

## Type Inference

You don't need to specify the type if the value is clear:

```kotlin
val age = 5      // Int
val name = "Tom" // String
val height = 1.78 // Double
```

## Static Typing

Once a variable is assigned a type, it can't hold values of another type:

```kotlin
var height: Double = 1.78
height = "high" // Error!
```

You also cannot directly assign one type to another (for example, `Int` to `Long`):

```kotlin
var longN: Long = 2
var intN: Int = 4
longN = intN // Error!
```

To convert between types, use conversion functions:

```kotlin
longN = intN.toLong() // OK
```

## The Any Type

The `Any` type can hold any value:

```kotlin
var value: Any = "Text"
value = 123
```

---

This chapter covers all basic types you'll need for most Kotlin programs. We'll look more closely at type conversions and collections later.