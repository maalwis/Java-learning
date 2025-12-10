package com.oop.Properties.Polymorphism;

/**
 * This subclass extends `Shape` and overrides the `area()` method to provide a specific
 * implementation. This demonstrates runtime polymorphism: when a `Circle` object is
 * referenced by a `Shape` type variable, the overridden `area()` method in `Circle` is
 * called at runtime. The `@Override` annotation ensures the method matches the superclass
 * signature, catching errors at compile time if it doesn’t.
 *
 * Your question: "Before I use this annotation, the method is still called, why?"
 * Answer: Overriding works without `@Override` because it’s the method signature (name
 * and parameters) that matters, not the annotation. The annotation is optional but
 * recommended for clarity and error checking.
 */
public class Circle extends Shape {
    /**
     * Overrides the `area()` method from `Shape`. When called on a `Circle` object,
     * this implementation runs instead of the superclass version, demonstrating
     * runtime polymorphism.
     */
    @Override
    void area() {
        System.out.println("this the Circle class (subclass)");
    }
}