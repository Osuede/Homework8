# Homework 8: Structural Design Patterns (Bridge, Decorator)

A Java project using the Bridge and Decorator patterns, tested with JUnit 5 and Maven.

## Requirements

- Java 17 or newer
- Maven 3.9 or newer

## Run the tests

```
mvn test
```

In VS Code you can also run them from the Testing panel.

## Run the drivers

```
mvn -q compile
java -cp target/classes bridge.BridgeDriver
java -cp target/classes decorator.DecoratorDriver
```

## Project structure

```
src/main/java/bridge/
  NotificationChannel.java          implementor interface
  EmailChannel.java                 Part 1
  SmsChannel.java                   Part 1
  PushChannel.java                  Part 3
  PaymentNotification.java          abstraction (holds the channel = the bridge)
  OnlinePaymentNotification.java    Part 1 (credit card / PayPal)
  CashOnDeliveryPayment.java        Part 1
  BitcoinPayment.java               Part 2
  BridgeDriver.java

src/main/java/decorator/
  FoodItem.java                     component interface
  Burger.java, Fries.java, HotDog.java          concrete components
  ToppingDecorator.java             decorator (wraps a FoodItem)
  Ketchup.java, Cheese.java, Onions.java        concrete decorators
  Order.java                        list of items + total
  LoyaltyStatus.java                discount on the order total
  DecoratorDriver.java

src/test/java/bridge/               one test class per class above
  RecordingChannel.java             fake channel that records messages (test helper)
src/test/java/decorator/            one test class per class above
  FakeFoodItem.java                 fake food item with a fixed price (test helper)
```

## Prices used

| Item | Price |
|---|---|
| Burger | 5.99 |
| Fries | 2.49 |
| Hot Dog | 3.49 |
| Ketchup | 0.25 |
| Cheese | 0.75 |
| Onions | 0.50 |
