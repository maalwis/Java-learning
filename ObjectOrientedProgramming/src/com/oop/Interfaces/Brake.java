package com.oop.Interfaces;

/**
 * The `Brake` interface defines a contract for any class that needs to implement braking functionality.
 * Interfaces in Java are used to specify a set of methods that must be implemented by any class that
 * implements the interface, promoting abstraction and polymorphism. This interface declares a single
 * abstract method, `brake()`, which must be provided by implementing classes. It exemplifies the
 * principle that interfaces define "what" must be done, not "how" it is done.
 */
public interface Brake {
    /**
     * Declares the abstract method `brake()`, which must be implemented by any class that implements
     * this interface. In interfaces, methods are implicitly `public` and `abstract`, so these modifiers
     * are not required explicitly. Interface methods are "public and abstract by default."
     */
    void brake();
}