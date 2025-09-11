# Advanced OOP Practice: Online Shopping System

---

## Task Description

You are building a more advanced online shopping system.  
Use everything you know about OOP: abstract classes, inheritance, overriding, interfaces, encapsulation, and polymorphism.

### Scenario

- There is a `User` who has a bank account and can make purchases in the online shop.
- Orders can be regular, express, or gift orders.
- Purchases must be processed by a `Service` that can work with objects using interfaces.

### Requirements

#### 1. User and Bank Account

- Create a class `BankAccount` with a private property `balance` (Double).
- Create a class `User` with properties: `name` (String), `account` (BankAccount).
- Add a function in `User` called `showBalance()` that prints the current balance.

#### 2. Abstract Order

- Make an abstract class `Order` with:
    - Properties: `orderId` (Int), `user` (User)
    - Abstract function `totalAmount()`: Double
    - Open function `displayInfo()` that prints basic info about the order.

#### 3. Specialized Orders

- Make a class `ExpressOrder` (inherits `Order`) with:
    - Property `expressFee` (Double, protected)
    - Override `totalAmount()` to include the express fee.
    - Override `displayInfo()` to show all info.

- Make a class `GiftOrder` (inherits `ExpressOrder`) with:
    - Property `giftMessage` (String)
    - Override `displayInfo()` to show all info including the gift message.

#### 4. Service Interfaces

- Create an interface `AccountService`:
    - Function `withdraw(account: BankAccount, amount: Double): Boolean` (returns true if successful).
    - Function `deposit(account: BankAccount, amount: Double): Boolean`.

- Create an interface `OrderService`:
    - Function `processOrder(order: Order): Boolean` (tries to withdraw the total amount from the user's bank account and returns true if successful).

#### 5. Implement Services

- Implement a class `SimpleAccountService` that works with `BankAccount` and implements `AccountService`.
- Implement a class `OnlineOrderService` that uses `AccountService` and implements `OrderService`.

#### 6. Main Scenario

- Create a user with some money in the bank.
- Make a few orders: regular, express, gift.
- Process the orders using the services.
- Print all info: balances, order details, and show what happens if the user does not have enough money.

---

## Extra

- Use correct access modifiers for properties and functions.
- Use polymorphism when processing orders.
- Make sure to explain your solution step by step.

---