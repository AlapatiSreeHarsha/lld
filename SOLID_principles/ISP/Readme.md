# Interface Segregation Principle (ISP)

## Simple Definition
A class should not be forced to implement methods it does not use. Instead of one big interface, use smaller, focused interfaces.

## Real-life Example
If you create one interface for printing, scanning, and faxing, a simple printer class would need to implement methods it does not support. Better to split them into smaller interfaces.

## Why This Principle Matters
It keeps interfaces clean and avoids unnecessary dependencies.

## Benefits
- Cleaner code
- Easier implementation
- Less confusion
- Better flexibility

## Common Mistakes When Violating ISP
- Creating very large interfaces with too many methods
- Making classes implement methods they never use
- Forcing unrelated classes to depend on unnecessary behavior