# Advanced OOP Practice: Online Shopping System (Simplified, Using List)

---

## Task Description

You are building a more realistic online shopping system using Kotlin and Object-Oriented Programming.  
Apply your knowledge of data classes, enums, encapsulation, interfaces, inheritance, overriding, and polymorphism.

### Scenario

- The system supports a `User` who has a bank account, personal details, and an address.
- Orders can be regular, express, or gift. Each order has a status (enum), delivery address, and can contain multiple products.
- Users can add products to a shopping cart and place orders.
- Products have basic properties (no stock tracking).
- All sensitive data must be fully encapsulated.
- Order processing must use interfaces and update order status.
- Use data classes for entities where appropriate (e.g., User, Address, Product).
- Order status must be represented by an enum.
- Add realistic properties to entities (e.g., email, phone for user; product details).

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
  - Private mutable list of products.
  - Functions to add/remove products, get total, and clear cart.

#### Order (Regular, Express, Gift)

- Make `Order` a concrete class with:
  - `orderId` (Int)
  - `user` (User)
  - `products` (List of Product)
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

- `AccountService`:
  - `withdraw(account: BankAccount, amount: Double): Boolean`
  - `deposit(account: BankAccount, amount: Double): Boolean`

- `OrderService`:
  - `processOrder(order: Order): Boolean` (withdraws money, updates status).
  - `cancelOrder(order: Order): Boolean` (refunds money, updates status).

### 4. Service Implementations

- `SimpleAccountService`: implements `AccountService`.
- `OnlineOrderService`: implements `OrderService`, processes/cancels orders and handles status logic.

### 5. Main Scenario

- Create a user with a bank account and an address.
- Add products to the cart.
- Place several orders (regular, express, gift).
- Process and cancel some orders, demonstrating status changes and refunds.
- Print all information after each operation.

---

## Extra

- Use correct access modifiers everywhere.
- Use data classes where possible.
- All sensitive and mutable data must be private.
- Make the solution realistic and clear.

---