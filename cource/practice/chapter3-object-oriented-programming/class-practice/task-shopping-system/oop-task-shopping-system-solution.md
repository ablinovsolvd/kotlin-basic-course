# Solution: Advanced OOP Shopping System

---

## 1. BankAccount and User

We start with a secure bank account (using encapsulation):

```kotlin
class BankAccount(private var balance: Double) {
    fun getBalance(): Double = balance

    fun withdraw(amount: Double): Boolean {
        return if (amount > 0 && balance >= amount) {
            balance -= amount
            true
        } else {
            false
        }
    }

    fun deposit(amount: Double): Boolean {
        return if (amount > 0) {
            balance += amount
            true
        } else {
            false
        }
    }
}
```

A user owns a bank account:

```kotlin
class User(val name: String, val account: BankAccount) {
    fun showBalance() {
        println("$name's balance: ${account.getBalance()}")
    }
}
```

---

## 2. Abstract Order Class

We use abstraction and inheritance for different order types:

```kotlin
abstract class Order(
    val orderId: Int,
    val user: User
) {
    abstract fun totalAmount(): Double

    open fun displayInfo() {
        println("Order #$orderId for ${user.name}")
    }
}
```

---

## 3. Specialized Orders

### ExpressOrder

Express fee is protected (for inheritance):

```kotlin
open class ExpressOrder(
    orderId: Int,
    user: User,
    protected var expressFee: Double,
    private val baseAmount: Double
) : Order(orderId, user) {

    override fun totalAmount(): Double = baseAmount + expressFee

    override fun displayInfo() {
        println("Order #$orderId for ${user.name} - Express Fee: $expressFee - Total: ${totalAmount()}")
    }
}
```

### GiftOrder

Adds a gift message, overrides info:

```kotlin
class GiftOrder(
    orderId: Int,
    user: User,
    expressFee: Double,
    baseAmount: Double,
    val giftMessage: String
) : ExpressOrder(orderId, user, expressFee, baseAmount) {

    override fun displayInfo() {
        println("Order #$orderId for ${user.name} - Express Fee: $expressFee - Total: ${totalAmount()} - Gift Message: $giftMessage")
    }
}
```

---

## 4. Service Interfaces

Abstract the logic for working with accounts and orders:

```kotlin
interface AccountService {
    fun withdraw(account: BankAccount, amount: Double): Boolean
    fun deposit(account: BankAccount, amount: Double): Boolean
}

interface OrderService {
    fun processOrder(order: Order): Boolean
}
```

---

## 5. Service Implementations

### Account Service

```kotlin
class SimpleAccountService : AccountService {
    override fun withdraw(account: BankAccount, amount: Double): Boolean {
        return account.withdraw(amount)
    }
    override fun deposit(account: BankAccount, amount: Double): Boolean {
        return account.deposit(amount)
    }
}
```

### Order Service

Uses AccountService and processes any order (polymorphism!):

```kotlin
class OnlineOrderService(private val accountService: AccountService) : OrderService {
    override fun processOrder(order: Order): Boolean {
        val amount = order.totalAmount()
        val success = accountService.withdraw(order.user.account, amount)
        if (success) {
            println("Order #${order.orderId} processed successfully for ${order.user.name}. Amount: $amount")
        } else {
            println("Order #${order.orderId} failed for ${order.user.name}. Not enough funds!")
        }
        return success
    }
}
```

---

## 6. Main Scenario

Putting it all together:

```kotlin
fun main() {
    val account = BankAccount(100.0)
    val user = User("Alice", account)
    val accountService = SimpleAccountService()
    val orderService = OnlineOrderService(accountService)

    val order1 = object : Order(1, user) { // Regular order using anonymous class
        override fun totalAmount(): Double = 30.0
        override fun displayInfo() {
            println("Order #$orderId for ${user.name} - Regular Order - Total: ${totalAmount()}")
        }
    }

    val expressOrder = ExpressOrder(2, user, 10.0, 40.0)
    val giftOrder = GiftOrder(3, user, 15.0, 50.0, "Happy Birthday!")

    val orders = listOf(order1, expressOrder, giftOrder)

    for (order in orders) {
        order.displayInfo()
        orderService.processOrder(order)
        user.showBalance()
        println("---")
    }

    // Try another order that costs more than the remaining balance
    val expensiveOrder = ExpressOrder(4, user, 10.0, 100.0)
    expensiveOrder.displayInfo()
    orderService.processOrder(expensiveOrder)
    user.showBalance()
}
```

---

## Explanation

- **Encapsulation**: BankAccount's balance is private.
- **Abstraction**: Order is abstract; specific orders inherit and implement details.
- **Inheritance & Overriding**: ExpressOrder and GiftOrder inherit and override functions.
- **Polymorphism**: OnlineOrderService works with any Order type.
- **Interfaces**: Services use interfaces to define their actions.
- **Access Modifiers**: expressFee is protected.

This design is flexible, safe, and easy to extend.  
You can add new order types or services by following the same principles.

---