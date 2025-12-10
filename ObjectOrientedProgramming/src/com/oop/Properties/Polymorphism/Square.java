package com.oop.Properties.Polymorphism;

/**
 * This subclass extends `Shape` and overrides the `area()` method, contributing to
 * runtime polymorphism. Similar to `Circle`, the method executed depends on the object’s
 * actual type at runtime. The `@Override` annotation ensures correctness.
 */
public class Square extends Shape {
    /**
     * Overrides the `area()` method from `Shape`. This version runs for `Square` objects.
     */
    @Override
    void area() {
        System.out.println("this the Square class (subclass)");
    }
}