# Open/Closed Principle (OCP)

## Simple Definition
Software entities should be open for extension but closed for modification. This means you should be able to add new behavior without changing existing working code.

## Real-life Example
Suppose you already have a payment system that supports cash and card payments. To add a new payment method like UPI, you should add a new class instead of rewriting the existing payment code.

## Why This Principle Matters
It helps protect existing working functionality while allowing new features to be added safely.

## Benefits
- Safer code changes
- Easier feature expansion
- Less risk of breaking old functionality
- Better long-term maintainability

## Common Mistakes When Violating OCP
- Editing old classes repeatedly to add new behavior
- Hardcoding new logic inside existing methods
- Making the system tightly dependent on specific implementations