package com.oop.AccessControl.package02;

import com.oop.AccessControl.package01.A;

/**
 * This class, `C`, extends `A` from a different package (package02 vs. package01), illustrating how
 * access modifiers restrict a subclass’s access when it’s outside the superclasses package. It can
 * access public and protected members of `A` directly because it’s a subclass, but default and
 * private members are inaccessible due to package boundaries and encapsulation. The `testAccess()`
 * method tests these rules, showing the limitations imposed by being in a different package and
 * reinforcing the role of `protected` in inheritance across packages.
 */
public class C extends A {
    // Constructor: Calls superclass constructor
    public C(int num, int[] arr, String name, double salary, int defaultAge) {
        super(num, arr, name, salary, defaultAge);
    }

    // Method to test access to superclass members
    public void testAccess() {
        // Public field: Accessible from anywhere
        System.out.println("Public num: " + num); // Correct: No restriction

        // Protected field: Accessible by subclasses, even in different packages
        System.out.println("Protected name: " + name); // Correct: Allowed due to inheritance

        // Private field: NOT accessible outside the declaring class
        // System.out.println("Private salary: " + salary); // Correctly commented as an error

        // Default field: NOT accessible outside package01
        // System.out.println("Default age: " + defaultAge); // Correctly identified as an error in your notes

        // Public method: Callable from anywhere
        displayPublic();    // Correct: No restriction

        // Protected method: Callable by subclasses, even in different packages
        displayProtected(); // Correct: Allowed due to inheritance

        // Default method: NOT callable outside package01
        // displayDefault();   // Correctly commented as an error

        // Private method: NOT callable outside the declaring class
        // displayPrivate(); // Correctly commented as an error

        // Public method to access private data indirectly
        showPrivateData(); // Correct: Works via public interface

        A objA = new A(10, new int[]{1, 2, 3}, "John", 50000.0, 25);
        // public members (objA.num) are accessible. protected members (objA.name, objA.displayProtected())
        // are not accessible through an A instance from package02.
        // This is a key rule: protected members can only be accessed via the subclass’s own type (e.g., this.name) or
        // its subclasses, not through a superclass instance in a different package.

        System.out.println(objA.num);           // Public: Allowed
        // System.out.println(objA.name);       // Protected: Error (different package)
    }
}