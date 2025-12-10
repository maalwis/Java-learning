package com.oop.AbstractClasses;

/**
 * The class `C` also extends the abstract class `A`, providing its own implementations for the abstract methods
 * `func00()` and `func01()`. Unlike `B`, it does not override the concrete method `funcDefault()`, so it inherits
 * the default behavior from `A`. This illustrates that multiple subclasses can extend the same abstract class,
 * each tailoring the required methods to their needs while sharing common structure.
 */
public class C extends A {

    /**
     * Constructor for `C`, mirroring `B` by calling the superclass constructor.
     * @param a Value passed to the superclass constructor for the `a` field
     */
    public C(int a) {
        super(a, 12); // Calls A's constructor with `a` and a fixed value (12) for `VALUE`
    }

    // Implements the abstract method `func00()` from A
    @Override
    void func00() {
        System.out.println("overridden func00() in C class"); // C’s specific implementation
    }

    // Implements the abstract method `func01()` from A
    @Override
    void func01() {
        System.out.println("overridden func01() in C class"); // Defines C’s behavior for `func01()`
    }
}