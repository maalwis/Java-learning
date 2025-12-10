package com.oop.AccessControl.package02;

import com.oop.AccessControl.package01.A;

/**
 * This class, `Main`, is an unrelated class in a different package (package02) from `A` (package01),
 * demonstrating how access modifiers restrict access from outside the package and without inheritance.
 * Only public members of `A` are accessible, while protected, default, and private members are hidden,
 * enforcing encapsulation. The `main` method tests these restrictions, showing that private data can
 * still be accessed indirectly through public methods, a key technique for controlled exposure of
 * internal state.
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of A
        A objA = new A(10, new int[]{1, 2, 3}, "John", 50000.0, 25);

        // Public field: Accessible from anywhere
        System.out.println("Accessing public num: " + objA.num); // Correct: No restriction

        // Public method: Callable from anywhere
        objA.displayPublic(); // Correct: Works fine

        // Protected field: NOT accessible from a different package without subclass relationship
        // System.out.println(objA.name); // Correctly commented as an error

        // Default field: NOT accessible outside package01
        // System.out.println(objA.defaultAge); // Correctly commented as an error

        // Protected method: NOT accessible without inheritance
        // objA.displayProtected(); // Correctly commented as an error

        // Default method: NOT accessible outside package01
        // objA.displayDefault(); // Correctly commented as an error

        // Private field: NOT accessible outside the class
        // System.out.println(objA.salary); // Correctly commented as an error

        // Private method: NOT accessible outside the class
        // objA.displayPrivate(); // Correctly commented as an error

        // Public method to access private data indirectly
        objA.showPrivateData(); // Correct: Allowed via public interface
    }
}