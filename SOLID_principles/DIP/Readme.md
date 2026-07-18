# Dependency Inversion Principle (DIP)

## Simple Definition
High-level modules should depend on abstractions, not on concrete implementations. In other words, depend on interfaces or abstract classes rather than specific classes.

## Real-life Example
A `OrderService` should depend on a `PaymentGateway` interface instead of directly depending on a specific payment class like `PayPalPayment`.

## Why This Principle Matters
It reduces tight coupling and makes the system easier to change and test.

## Benefits
- Better flexibility
- Easier testing with mocks
- Lower coupling
- Easier to swap implementations

## Common Mistakes When Violating DIP
- Creating classes that directly depend on concrete classes
- Hardcoding implementation details inside business logic
- Making code difficult to change because everything is tightly connected