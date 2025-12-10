package com.oop.SingletonClasses;

/**
 * This class demonstrates the practical usage of the Singleton pattern by obtaining multiple references to the
 * Singleton instance. The Singleton pattern ensures that all references point to the same object in memory,
 * showcasing its core feature: a single instance across the application.
 * <p>
 * In this example, the `getInstance()` method of the `Singleton` class is called multiple times to assign references
 * to variables `singleton00`, `singleton01`, and `singleton02`. Because `getInstance()` always returns the same
 * instance, all three variables refer to the identical object. This can be verified by comparing the references
 * (e.g., `singleton00 == singleton01` would return `true`), confirming the Singleton behavior.
 * <p>
 * This setup illustrates how the Singleton pattern provides a consistent, globally accessible instance that can be
 * used across different parts of a program without creating duplicates.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton00 = Singleton.getInstance();
        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();
    }
}