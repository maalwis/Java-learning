package com.oop.AccessControl.package01;

/**
 * This class, `A`, serves as a parent class to demonstrate Java's access modifiers: public, protected,
 * private, and default (no modifier). It defines fields and methods with each access level to illustrate
 * their visibility and accessibility from different contexts—within the same package, from subclasses
 * in the same or different packages, and from unrelated classes in different packages. The purpose is
 * to show how access modifiers enforce encapsulation by controlling which parts of a class are exposed
 * or hidden, a key concept in object-oriented programming. The class also includes a public method to
 * indirectly access private data, highlighting a common pattern for controlled access.
 */
public class A {
    // Public: Accessible from anywhere, including other packages
    public int num;
    public int[] arr;

    // Protected: Accessible within the same package and by subclasses (even in different packages)
    protected String name;

    // Private: Accessible only within this class, not even by subclasses or other classes in the same package
    private double salary;

    // Default (no modifier): Accessible only within the same package (package-private)
    int defaultAge;

    // Constructor: Public so it can be called from anywhere to instantiate the class
    public A(int num, int[] arr, String name, double salary, int defaultAge) {
        this.num = num;        // Initialize public field
        this.arr = arr;        // Initialize public array
        this.name = name;      // Initialize protected field
        this.salary = salary;  // Initialize private field
        this.defaultAge = defaultAge; // Initialize default field
    }

    // Public method: Accessible from any class, demonstrating unrestricted visibility
    public void displayPublic() {
        System.out.println("Public method: num = " + num);
    }

    // Protected method: Accessible within package01 and by subclasses in any package
    protected void displayProtected() {
        System.out.println("Protected method: name = " + name);
    }

    // Private method: Only callable within this class, hidden from all external access
    private void displayPrivate() {
        System.out.println("Private method: salary = " + salary);
    }

    // Default method: Accessible only within package01, not visible to subclasses or classes outside the package
    void displayDefault() {
        System.out.println("Default method: age = " + defaultAge);
    }

    // Public method to indirectly access private data, showing how encapsulation can be maintained
    public void showPrivateData() {
        displayPrivate(); // Allowed because it’s within the same class
    }
}