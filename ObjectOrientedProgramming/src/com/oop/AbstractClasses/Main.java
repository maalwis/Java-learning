package com.oop.AbstractClasses;

/**
 * The `Main` class serves as a demonstration of how abstract classes and their subclasses interact in Java. It
 * creates instances of `B` and `C`, invokes their methods, and showcases key concepts like polymorphism, static
 * method calls, and the inability to instantiate abstract classes directly. It also illustrates the use of
 * anonymous subclasses and abstract class references to achieve flexible, runtime behavior.
 */
public class Main {
    public static void main(String[] args) {
        // Instantiate `B` and call its methods
        B bObj = new B(00); // Creates a `B` object, invoking A’s constructor indirectly
        bObj.func00();      // Calls B’s implementation of `func00()`
        bObj.funcDefault(); // Calls B’s overridden `funcDefault()`, which invokes A’s version

        // Instantiate `C` and call its methods
        C cObj = new C(00); // Creates a `C` object
        cObj.func00();      // Calls C’s implementation of `func00()`
        cObj.funcDefault(); // Calls A’s `funcDefault()` since C doesn’t override it

        // Call the static method from `A` directly using the class name
        A.func(); // Invokes the static method; no instance required

        // Anonymous subclass of `A`: Provides implementations for abstract methods to create an instance
        A aObj = new A(00, 00) {
            @Override
            void func00() { /* Minimal implementation */ }
            @Override
            void func01() { /* Minimal implementation */ }
        };

        // Polymorphism: Use an abstract class reference to point to a subclass object
        A aRefBObj = new B(00); // `A` reference to a `B` object
        aRefBObj.func00();      // Calls B’s `func00()` via the `A` reference, demonstrating polymorphism
    }
}