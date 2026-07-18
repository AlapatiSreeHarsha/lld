# Liskov Substitution Principle (LSP)

## Simple Definition
Objects of a superclass should be replaceable with objects of a subclass without breaking the program.

## Real-life Example
If a `Shape` class has a method `calculateArea()`, then any subclass like `Rectangle` or `Circle` should behave correctly when used in place of `Shape`.

## Why This Principle Matters
This ensures that inheritance is used correctly and that subclasses honor the behavior expected by the parent class.

## Benefits
- Reliable inheritance
- Better polymorphism
- Fewer runtime surprises
- Cleaner object-oriented design

## Common Mistakes When Violating LSP
- A subclass changes the meaning of a parent method
- A subclass throws unexpected exceptions
- A subclass does not fully support the contract of the parent class