# Exercise 1: Singleton Pattern – Logger Implementation

## Objective
To design and implement a logging utility using the Singleton design pattern, ensuring that only a single instance of the logger exists and is used consistently throughout the application's lifecycle.

## Implementation Overview

### Logger.java
- Defined a `private static` instance of the `Logger` class.
- Used a `private constructor` to restrict instantiation from outside the class.
- Implemented a `public static getInstance()` method that lazily initializes and returns the singleton instance.

### LoggerTest.java
- Validated the Singleton behavior by retrieving the logger instance multiple times and ensuring they reference the same object.
- Logged multiple messages through the shared instance to verify consistent functionality.

### Main.java
- Served as the application entry point.
- Initialized the logger and triggered the test suite to demonstrate the effectiveness of the implementation.

## Result
The application output confirms that:
- The logger was initialized only once.
- Multiple calls to `Logger.getInstance()` returned the same instance.
- Logging operations were consistent across calls.

### Outcome:
PASS: Both logger instances are the same.


The implementation successfully demonstrates the Singleton pattern as intended.
