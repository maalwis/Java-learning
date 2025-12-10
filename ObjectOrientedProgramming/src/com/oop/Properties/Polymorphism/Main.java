package com.oop.Properties.Polymorphism;

/**
 * This class demonstrates runtime polymorphism by showing how method overriding works
 * with superclass references and subclass objects. A superclass reference (`Shape`) can
 * point to a subclass object (`Circle`, `Square`, etc.), and the method called depends
 * on the object’s actual type at runtime, not the reference type. This is facilitated
 * by Java’s dynamic method dispatch mechanism.
 *
 * Your question: "Why does `Shape circle00 = new Circle()` call `Circle`’s `area()`?"
 * Answer: The reference type (`Shape`) defines what methods are accessible (compile-time),
 * but the object type (`Circle`) determines which overridden method runs (runtime).
 */
public class Main {
    public static void main(String[] args) {
        // Direct instantiation of `Shape`. Calls `Shape`’s `area()`.
        Shape shape = new Shape();
        // Direct instantiation of `Circle`. Calls `Circle`’s `area()`.
        Circle circle = new Circle();
        // Direct instantiation of `Square`. Calls `Square`’s `area()`.
        Square square = new Square();
        // Direct instantiation of `Triangle`. Calls `Triangle`’s `area()`.
        Triangle triangle = new Triangle();

        // Calls `Shape`’s `area()` because the object is of type `Shape`.
        shape.area();   // Output: "this the Shape class (superclass)"
        // Calls `Circle`’s overridden `area()` because the object is `Circle`.
        circle.area();  // Output: "this the Circle class (subclass)"
        // Calls `Square`’s overridden `area()` because the object is `Square`.
        square.area();  // Output: "this the Square class (subclass)"
        // Calls `Triangle`’s overridden `area()` because the object is `Triangle`.
        triangle.area(); // Output: "this the Triangle class (subclass)"

        // Upcasting: `Shape` reference to a `Circle` object.
        Shape circle00 = new Circle();
        // Calls `Circle`’s `area()` due to runtime polymorphism (dynamic method dispatch).
        // The reference type `Shape` allows access to `area()`, but the object type
        // `Circle` determines the implementation.
        circle00.area(); // Output: "this the Circle class (subclass)"
    }
}