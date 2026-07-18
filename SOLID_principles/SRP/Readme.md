# Single Responsibility Principle (SRP)

## Simple Definition
A class should have only one reason to change. In simple words, one class should focus on one responsibility.

## Real-life Example
Think of a "Student" class that should only represent student data. It should not also handle printing reports, sending emails, and storing data in the database.

## Why This Principle Matters
When a class does too many things, small changes can break unrelated parts of the system. This makes code harder to understand and maintain.

## Benefits
- Easier to understand
- Easier to test
- Easier to modify
- Lower chance of bugs

## Common Mistakes When Violating SRP
- Putting business logic, database logic, and UI logic in one class
- Writing a class that handles too many tasks
- Making one class responsible for multiple unrelated features