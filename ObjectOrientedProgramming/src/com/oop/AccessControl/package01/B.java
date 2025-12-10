package com.oop.AccessControl.package01;

/**
 * This class, `B`, extends `A` and resides in the same package (package01), showcasing how a subclass
 * in the same package can access members of the superclass based on their access modifiers. It can
 * directly access public, protected, and default members of `A` due to being in the same package,
 * but it cannot access private members directly. The `testAccess()` method tests these access levels,
 * demonstrating the broader visibility within the same package compared to subclasses or classes
 * in different packages. This highlights how package boundaries and inheritance interact with access
 * modifiers.
 */
class B extends A {
    // Constructor: Calls the superclass constructor to initialize fields
    public B(int num, int[] arr, String name, double salary, int defaultAge) {
        super(num, arr, name, salary, defaultAge);
    }

    // Method to test access to superclass members
    public void testAccess() {

        // Public field: Accessible from anywhere, including this subclass
        System.out.println("Public num: " + num); // Correct: No restriction on public access

        // Protected field: Accessible in same package and by subclasses
        System.out.println("Protected name: " + name); // Correct: Allowed due to same package and subclass status


        // Private field: NOT accessible, even in a subclass or same package
        // System.out.println("Private salary: " + salary);

        // Default field: Accessible because B is in the same package as A
        System.out.println("Default age: " + defaultAge); // Package-private access is allowed

        // Public method: Callable from anywhere
        displayPublic();    // Correct: No restriction

        // Protected method: Callable within package and by subclasses
        displayProtected(); // Correct: Allowed due to same package and inheritance

        // Default method: Callable only within the same package
        displayDefault();   // Correct: Allowed because B is in package01

        // Private method: NOT callable outside the declaring class
        // displayPrivate(); // Correctly commented as an error in your notes

        // Public method to access private data indirectly
        showPrivateData(); // Correct: Demonstrates encapsulation by using a public interface

        // Create an instance of A
        A objA = new A(10, new int[]{1, 2, 3}, "John", 50000.0, 25);

        // public members are accessible (objA.num).
        //protected members are accessible (objA.name, objA.displayProtected()) because B is in the same package as A.
        //default members are accessible (objA.defaultAge) within package01.
        //private members remain inaccessible (objA.salary causes an error).

        // Via instance of A
        System.out.println(objA.num);           // Public: Allowed
        System.out.println(objA.name);          // Protected: Allowed (same package)
        // System.out.println(objA.salary);     // Private: Error
        System.out.println(objA.defaultAge);    // Default: Allowed (same package)

        objA.displayPublic();                   // Public: Allowed
        objA.displayProtected();                // Protected: Allowed (same package)
        objA.showPrivateData();                 // Public: Allowed (calls private method internally)


    }
}