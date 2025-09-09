# Class Practice Tasks — Units 1-5: Inheritance & Overriding

---

## Task 1: Smart Devices

Imagine you are designing software for smart home devices.

- There is a basic class `Device` with properties like `name` and a function `turnOn()` that prints a simple message.
- You need to make a class `SmartLamp` that comes from `Device` and adds a property for brightness.
- Override the `turnOn()` function in `SmartLamp` so it prints a message including the lamp’s name and brightness.

**Extra:**  
Add a getter for the brightness property so that if the brightness is less than 10, it always returns 10.

---

## Task 2: Online Orders

You are working on an online shopping system.

- There is a class `Order` with properties like `orderId` and `status`, and a function `displayInfo()` that shows basic info about the order.
- Make a class `ExpressOrder` that comes from `Order` and adds the property `expressFee`.
- Override `displayInfo()` in `ExpressOrder` so it shows all order info plus the express fee.
- Make another class `GiftOrder` that comes from `ExpressOrder` and adds a property `giftMessage`.
- Override `displayInfo()` in `GiftOrder` so it shows all info, fee, and the gift message.

**Extra:**  
Use access modifiers so that `expressFee` can only be changed inside `ExpressOrder` and its subclasses, but not from outside.

---

Take your time to solve these tasks! Try to use everything you’ve learned: classes, constructors, inheritance, overriding, getters/setters, and access modifiers.