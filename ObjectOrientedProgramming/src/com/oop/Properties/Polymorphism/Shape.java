package com.oop.Properties.Polymorphism;

/**
 * This class is a superclass demonstrating runtime polymorphism, also known as dynamic
 * polymorphism, through method overriding. Runtime polymorphism occurs when a subclass
 * provides a specific implementation of a method declared in its superclass. The method
 * to be executed is determined at runtime based on the actual object type, not the
 * reference type. This class defines a base `area()` method that subclasses will override.
 */
public class Shape {
    /**
     * Base method intended to be overridden by subclasses. When called directly on a
     * Shape object, it executes this implementation. Subclasses can redefine it.
     */
    void area() {
        System.out.println("this the Shape class (superclass)");
    }
}