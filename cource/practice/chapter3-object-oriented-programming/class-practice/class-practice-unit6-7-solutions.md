# Practice Solutions: Inheritance & Overriding

---

## Task 1: Smart Devices

**Condition:**  
Imagine you are designing software for smart home devices.

- There is a basic class `Device` with properties like `name` and a function `turnOn()` that prints a simple message.
- You need to make a class `SmartLamp` that comes from `Device` and adds a property for brightness.
- Override the `turnOn()` function in `SmartLamp` so it prints a message including the lamp’s name and brightness.

**Extra:**  
Add a getter for the brightness property so that if the brightness is less than 10, it always returns 10.

---

### Solution

#### Step 1: Create the base class `Device`

```kotlin
open class Device(val name: String) {
    open fun turnOn() {
        println("$name is now on.")
    }
}
```

#### Step 2: Make `SmartLamp` inherit from `Device` and add brightness

```kotlin
class SmartLamp(
    name: String,
    brightnessInput: Int
) : Device(name) {
    var brightness: Int = brightnessInput
        get() {
            // Getter: never less than 10
            if (field < 10) return 10
            return field
        }

    override fun turnOn() {
        println("$name is now on with brightness $brightness.")
    }
}
```

#### How it works

- `SmartLamp` uses a custom getter for brightness so it never goes below 10.
- The `turnOn()` function is overridden to show both name and brightness.

#### Example

```kotlin
fun main() {
    val lamp = SmartLamp("Living Room Lamp", 5)
    lamp.turnOn()  // Output: Living Room Lamp is now on with brightness 10.
}
```

---

## Task 2: Online Orders

**Condition:**  
You are working on an online shopping system.

- There is a class `Order` with properties like `orderId` and `status`, and a function `displayInfo()` that shows basic info about the order.
- Make a class `ExpressOrder` that comes from `Order` and adds the property `expressFee`.
- Override `displayInfo()` in `ExpressOrder` so it shows all order info plus the express fee.
- Make another class `GiftOrder` that comes from `ExpressOrder` and adds a property `giftMessage`.
- Override `displayInfo()` in `GiftOrder` so it shows all info, fee, and the gift message.

**Extra:**  
Use access modifiers so that `expressFee` can only be changed inside `ExpressOrder` and its subclasses, but not from outside.

---

### Solution

#### Step 1: Base class `Order`

```kotlin
open class Order(val orderId: Int, val status: String) {
    open fun displayInfo() {
        println("Order #$orderId - Status: $status")
    }
}
```

#### Step 2: Inherit with `ExpressOrder`, add expressFee with access control

```kotlin
open class ExpressOrder(
    orderId: Int,
    status: String,
    protected var expressFee: Double
) : Order(orderId, status) {
    override fun displayInfo() {
        println("Order #$orderId - Status: $status - Express Fee: $expressFee")
    }
}
```
- `expressFee` is marked `protected`: only `ExpressOrder` and its children can change it.

#### Step 3: Add `GiftOrder` inheriting from `ExpressOrder`, add giftMessage

```kotlin
class GiftOrder(
    orderId: Int,
    status: String,
    expressFee: Double,
    val giftMessage: String
) : ExpressOrder(orderId, status, expressFee) {
    override fun displayInfo() {
        println("Order #$orderId - Status: $status - Express Fee: $expressFee - Gift Message: $giftMessage")
    }
}
```

#### How it works

- Each class overrides `displayInfo()` to add its own info.

#### Example

```kotlin
fun main() {
    val order = Order(1001, "Pending")
    order.displayInfo() // Order #1001 - Status: Pending

    val express = ExpressOrder(1002, "Shipped", 5.0)
    express.displayInfo() // Order #1002 - Status: Shipped - Express Fee: 5.0

    val gift = GiftOrder(1003, "Delivered", 7.5, "Happy Birthday!")
    gift.displayInfo() // Order #1003 - Status: Delivered - Express Fee: 7.5 - Gift Message: Happy Birthday!
}
```

---

## Explanation

- These tasks use inheritance to build up classes step by step.
- Overriding lets child classes change how functions work.
- Access modifiers (like `protected`) help control who can change data.
- Getters make sure data is always correct.

Try changing the values and adding your own features!