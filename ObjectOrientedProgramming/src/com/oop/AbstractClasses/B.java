package com.oop.AbstractClasses;

/**
 * The class `B` extends the abstract class `A`, making it a concrete class by implementing all inherited abstract
 * methods (`func00()` and `func01()`). It also overrides the concrete method `funcDefault()` to customize its
 * behavior, demonstrating how subclasses can build upon or modify the functionality of an abstract superclass.
 * This class can be instantiated because it fulfills the contract imposed by `A`.
 */
public class B extends A {

    /**
     * Constructor for `B`. It invokes the superclass constructor to initialize inherited fields.
     * @param a Value passed to the superclass constructor for the `a` field
     */
    public B(int a) {
        super(a, 12); // Calls A's constructor, passing `a` and a fixed value (12) for `VALUE`
    }

    // Overrides the concrete method from A, extending its behavior
    @Override
    void funcDefault() {
        super.funcDefault(); // Calls the superclass version of `funcDefault()` to reuse its logic
    }

    // Implements the abstract method `func00()` from A
    @Override
    void func00() {
        System.out.println("overridden func00() in B class"); // Provides B’s specific implementation
    }

    // Implements the abstract method `func01()` from A
    @Override
    void func01() {
        System.out.println("overridden func01() in B class"); // Defines B’s behavior for `func01()`
    }
}