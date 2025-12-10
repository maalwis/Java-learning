package com.oop.AbstractClasses;

/**
 * This abstract class `A` serves as a foundational example of abstract classes in Java, which are used to define a
 * common structure for subclasses while allowing specific implementations to be deferred. Abstract classes can
 * include both abstract methods (without bodies, requiring subclass implementation) and concrete methods (with
 * bodies, usable or overridable by subclasses). Here, `A` declares two abstract methods, `func00()` and `func01()`,
 * which any concrete subclass must implement, alongside a static method, a concrete instance method, and fields.
 * This showcases the versatility of abstract classes in object-oriented programming.
 *<p>
 * Key Concepts:
 *<p>
 * - **Abstract Classes**: Cannot be instantiated directly; they are designed to be extended.
 * <p>
 * - **Abstract Methods**: Lack implementation and enforce subclass overrides.
 *<p>
 * - **Concrete Methods**: Provide default behavior that subclasses can use or override.
 *<p>
 * - **Static Methods**: Belong to the class itself, not instances, and cannot be abstract.
 *<p>
 * - **Final Fields**: Immutable constants initialized during object creation.
 *<p>
 *
 * Misconceptions Corrected:
 * - If an abstract class can be `final`. This is not possible because `final` prevents inheritance,
 *   while abstract classes exist to be extended—making these mutually exclusive.
 * - Constructors cannot be abstract because they are meant to initialize objects, not define behavior,
 *   and static methods cannot be abstract because they cannot be overridden.
 */
public abstract class A {
    int a;          // Instance variable, default access (package-private), accessible to subclasses in the same package
    final int VALUE; // Constant field, must be initialized in the constructor and cannot be changed afterward

    /**
     * Constructor for abstract class `A`. Abstract classes cannot be instantiated directly, but their constructors
     * are invoked when a subclass object is created to initialize inherited fields.
     * @param a Value for the instance variable `a`
     * @param value Value for the final field `VALUE`
     */
    public A(int a, int value) {
        this.a = a;       // Assigns the parameter to the instance variable `a`
        this.VALUE = value; // Initializes the final field; must be set here as it cannot be modified later
    }

    // Static method: Belongs to the class, not an instance, and can be called without creating an object
    static void func() {
        System.out.println("this is a static method in abstract class"); // Prints a message; cannot be overridden
    }

    // Concrete instance method: Provides default behavior that subclasses can use or override
    void funcDefault() {
        System.out.println("this is a default method in abstract class"); // Default implementation
    }

    // Abstract method: No implementation; subclasses must provide their own
    abstract void func00();

    // Abstract method: Ensures subclasses define this behavior
    abstract void func01();
}