package com.oop.SingletonClasses;

/**
 * This class implements the Singleton pattern, a design pattern that ensures only one instance of the class exists
 * throughout the application's lifecycle. The Singleton pattern is ideal for scenarios where a single point of control
 * is required, such as managing shared resources (e.g., database connections) or maintaining a consistent global state.
 * <p>
 * The implementation uses three key elements:
 * - A private constructor to prevent external instantiation, ensuring that no other class can create an instance
 *   using the `new` keyword.
 * - A private static variable `singletonInstance` to store the single instance of the class. It is static because it
 *   belongs to the class itself, not to any specific object.
 * - A public static method `getInstance()` that provides global access to the instance. If the instance doesn’t exist,
 *   it is created; otherwise, the existing instance is returned.
 * <p>
 * Note: This implementation has a bug—`singletonInstance` is not assigned in `getInstance()`, and it is not thread-safe.
 * In a correct implementation, the instance should be assigned when created, and in multi-threaded environments,
 * synchronization may be needed to prevent multiple instances from being created concurrently.
 */
public class Singleton {
    private static Singleton singletonInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton(); // Fixed: Assign the new instance to the static variable
        }
        return singletonInstance;
    }
}
