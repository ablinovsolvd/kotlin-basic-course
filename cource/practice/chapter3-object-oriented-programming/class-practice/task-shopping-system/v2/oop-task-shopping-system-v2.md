# Advanced OOP Practice: Enhanced Online Shopping System

---

## Task Description

You are building a deeper and more realistic online shopping system.  
Apply everything you know about OOP in Kotlin, including data classes, enums, encapsulation, interfaces, inheritance, overriding, and polymorphism.

### Scenario

- The system supports a `User` who has a bank account, personal details, and an address.
- Orders can be regular, express, or gift. Each order has a status (enum), delivery address, and can contain multiple products.
- Users can add products to a shopping cart and place orders.
- All sensitive data must be fully encapsulated.
- Order processing must use interfaces, and real-world business logic should be involved (e.g., updating order status, checking inventory, etc.).
- You must use data classes for entities where appropriate (e.g., User, Address, Product).
- Order status must be represented by an enum.
- Add more properties to entities for realism (e.g., email, phone for user; product details; etc.).

---

## Requirements

### 1. Domain Entities

#### User

- Make `User` a data class with:
    - `id` (Int)
    - `name` (String)
    - `email` (String)
    - `phone` (String)
    - `address` (Address)
    - Private property `account` (BankAccount)
    - Function `showBalance()` to print current balance.

#### Address

- Make `Address` a data class with:
    - `street` (String)
    - `city` (String)
    - `zip` (String)
    - `country` (String)

#### Product

- Make `Product` a data class with:
    - `id` (Int)
    - `name` (String)
    - `price` (Double)
    - `stock` (Int, mutable, private)

    - Function `decreaseStock(quantity: Int)`: Boolean

#### BankAccount

- Class `BankAccount` with encapsulated private property `balance` (Double).
- Functions:
    - `getBalance()`: Double
    - `withdraw(amount: Double)`: Boolean
    - `deposit(amount: Double)`: Boolean

### 2. Order, Status, and Cart

#### OrderStatus (Enum)

- Enum class `OrderStatus`: PENDING, PAID, SHIPPED, DELIVERED, CANCELLED

#### Cart

- Class `Cart`:
    - Private mutable list of products with quantity.
    - Functions to add/remove products, get total, and clear cart.

#### Order (Regular, Express, Gift)

- Make `Order` a concrete class with:
    - `orderId` (Int)
    - `user` (User)
    - `products` (List of Product + quantity)
    - `deliveryAddress` (Address)
    - `status` (OrderStatus)
    - Function `totalAmount()`: Double
    - Function `displayInfo()`
    - Implements `Trackable` (interface with track() that prints status)
    - All fields must be encapsulated.

- Make `ExpressOrder` and `GiftOrder` inherit from `Order`:
    - `ExpressOrder` adds protected `expressFee` (Double).
    - `GiftOrder` adds `giftMessage` (String).

### 3. Service Interfaces

- `AccountService`: same as before.
- `OrderService`:
    - `processOrder(order: Order): Boolean` (withdraws money, updates status, checks product stock).
    - `cancelOrder(order: Order): Boolean` (refunds money, updates status).

### 4. Service Implementations

- `SimpleAccountService`: same as before.
- `OnlineOrderService`:
    - Implements full logic for order processing, cancellation, and inventory updates.

### 5. Main Scenario

- Create a user with a bank account and an address.
- Add products to the cart.
- Place several orders (regular, express, gift).
- Process and cancel some orders, demonstrating status and stock changes.
- Print all information after each operation.

---

## Extra

- Use correct access modifiers everywhere.
- Use data classes where possible.
- All sensitive and mutable data must be private.
- Make the solution realistic and detailed.

---
