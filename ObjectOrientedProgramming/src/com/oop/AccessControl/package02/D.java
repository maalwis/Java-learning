package com.oop.AccessControl.package02;

import com.oop.AccessControl.package01.A;

/**
 * This class, `D`, extends `C` (which extends `A`), demonstrating how a subclass of a subclass inherits
 * and accesses protected members from the original superclass (`A`). Being in package02, it tests
 * access across multiple levels of inheritance and package boundaries. It can access protected members
 * inherited from `A` through `C`, but it cannot access them through an instance of `A` directly,
 * highlighting a nuance of `protected` access: it’s limited to the subclass’s own context or
 * inheritance chain, not through superclass instances from outside the package.
 */
public class D extends C {
    // Constructor: Calls superclass (C) constructor
    public D(int num, int[] arr, String name, double salary, int defaultAge) {
        super(num, arr, name, salary, defaultAge);
    }

    // Method to test access to inherited members
    public void testAccess() {
        // Protected field: Accessible via inheritance from C (originally from A)
        System.out.println("Protected name: " + name); // Correct: Inherited access

        // Protected method: Callable via inheritance
        displayProtected(); // Correct: Inherited from C

        // Trying to access protected members via an instance of A
        A objA = new A(10, new int[]{1, 2, 3}, "John", 50000.0, 25);
        // public members (objA.num) are accessible. protected members (objA.name, objA.displayProtected())
        // are inaccessible through an A instance because D is in package02, and protected access doesn’t extend
        // to superclass instances across packages.

        System.out.println(objA.num);       // Public: Allowed
        // System.out.println(objA.name);   // ERROR: Protected field not accessible via A instance
        // objA.displayProtected();         // ERROR: Protected method not accessible via A instance
    }

    // Main method to run the test
    public static void main(String[] args) {
        D objD = new D(10, new int[]{1, 2, 3}, "John", 50000.0, 25);
        objD.testAccess(); // Executes the access test
    }
}