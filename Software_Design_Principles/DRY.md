# DRY Principle

## Simple Definition
DRY stands for "Don't Repeat Yourself". It means you should avoid duplicating the same logic in multiple places.

## Real-life Example
If the same validation code is written in three different methods, it should be moved to one helper method instead of being copied everywhere.

## Why This Principle Matters
Repeated code makes maintenance harder. If you need to fix a bug or change behavior, you may have to update the same logic in many places.

## Benefits
- Less code duplication
- Easier maintenance
- Fewer bugs
- Better consistency

## Common Mistakes When Violating DRY
- Copy-pasting code instead of reusing it
- Keeping the same logic in multiple methods
- Updating one copy and forgetting the others