package com.oop.Properties.Polymorphism;

/**
 * This subclass extends `Shape` and overrides the `area()` method, participating in
 * runtime polymorphism. The `@Override` annotation confirms the method aligns with
 * the superclass declaration.
 */
public class Triangle extends Shape {
    /**
     * Overrides the `area()` method from `Shape`. Executed for `Triangle` objects at runtime.
     */
    @Override
    void area() {
        System.out.println("this the Triangle class (subclass)");
    }
}