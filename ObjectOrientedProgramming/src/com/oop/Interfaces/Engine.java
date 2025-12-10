package com.oop.Interfaces;

/**
 * The `Engine` interface specifies behavior for engine-related operations, including starting,
 * stopping, and accelerating. It also defines a constant field `capacity`, demonstrating that
 * variables in interfaces are implicitly `public`, `static`, and `final`. This interface serves as
 * a contract that implementing classes must follow, supporting the lecturer’s note that interfaces
 * "specify only what the class is doing, not how it is doing it." Your observation that variables
 * are "final and static by default" is correct, and the explicit use of `static final` here is
 * redundant but harmless.
 */
public interface Engine {
    /**
     * Defines a constant field `capacity`. In interfaces, all fields are implicitly `public`,
     * `static`, and `final`, meaning they are constants shared across all implementations and
     * cannot be modified. The explicit `static final` modifiers are redundant, as your notes
     * correctly imply; simply `int capacity = 1000;` would suffice.
     */
    static final int capacity = 1000;  // Redundant modifiers, but valid

    /**
     * Abstract method to start the engine. Implementing classes must provide a concrete
     * implementation. Implicitly `public` and `abstract`.
     */
    void start();

    /**
     * Abstract method to stop the engine. Implicitly `public` and `abstract`.
     */
    void stop();

    /**
     * Abstract method to accelerate the engine. Implicitly `public` and `abstract`.
     */
    void accelerate();
}