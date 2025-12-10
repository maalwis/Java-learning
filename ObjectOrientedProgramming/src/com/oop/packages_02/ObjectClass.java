package com.oop.packages_02;

/**
 * The `ObjectClass` demonstrates fundamental concepts of Java's `Object` class, the superclass of all
 * classes in Java. Located in the `java.lang` package (automatically imported), `Object` provides
 * methods like `hashCode()`, `equals()`, `toString()`, and `clone()`, which can be overridden to
 * customize behavior. This class explores these methods, focusing on object identity, equality,
 * and cloning. It includes a `main` method to test these concepts using instances with identical
 * field values, highlighting the distinction between reference equality (`==`) and content equality
 * (`equals()`), as well as the role of hash codes in identifying objects.
 * <p>
 * Key Concepts:
 * <p>
 * Implicit Inheritance:
 * <p>
 *  Every Java class extends `Object` implicitly unless another superclass
 *  is specified, forming a single inheritance chain (e.g., `B` extends `A`, which extends `Object`).
 * <p>
 * Method Overriding:
 * <p>
 * Customizing `Object` methods to alter default behavior, though this example
 *   retains defaults for demonstration.
 * <p>
 * Object Comparison:
 * <p>
 * == checks if two references point to the same object, while `equals()`
 * can be overridden to compare field values (content).
 * <p>
 * Hashing:
 * <p>
 * `hashCode()` generates a numeric identifier, often based on memory address by default,
 *  useful in data structures like hash tables.
 * <p>
 *  Java doesn’t support multiple inheritance. Instead, `B` extends `A`, and `A` extends
 *  `Object` implicitly—there’s no direct extension of both.
 */
public class ObjectClass {

    private int a;    // Integer field, accessible only within this class
    private float b;  // Float field, similarly private

    /**
     * Constructor to initialize the `a` and `b` fields.
     * @param a Integer value for field `a`
     * @param b Float value for field `b`
     */
    public ObjectClass(int a, float b) {
        this.a = a;  // Assigns parameter `a` to instance field `a`
        this.b = b;  // Assigns parameter `b` to instance field `b`
    }

    /**
     * Overrides `hashCode()` from `Object`. The default implementation returns a hash based on the
     * object’s memory address (not the address itself).it doesn’t give the memory location but a
     * derived value. Here, it’s not customized, so it uses the default.
     * @return Hash code of the object
     */
    @Override
    public int hashCode() {
        return super.hashCode();  // Calls `Object`’s default hashCode()
    }

    /**
     * Overrides `equals()` to compare this object with another. The default checks reference equality
     * (`==`), not content. Your note incorrectly states it compares "actual objects" (content) by
     * default—it doesn’t unless overridden. Here, it retains the default behavior.
     * @param obj Object to compare with
     * @return True if references are the same, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);  // Default: Reference equality only
    }

    /**
     * Overrides `clone()` to create a copy of the object. The default performs a shallow copy (field-by-field).
     * Requires `Cloneable` interface implementation, though not shown here, so this would throw an exception.
     * @return A cloned object
     * @throws CloneNotSupportedException If `Cloneable` isn’t implemented
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy of the object
    }

    /**
     * Overrides `toString()` to return a string representation. The default is `ClassName@hashCode`.
     * Here, it’s not customized, so it uses the default format.
     * @return String representation of the object
     */
    @Override
    public String toString() {
        return super.toString();  // Default: e.g., "ObjectClass@1a2b3c4d"
    }

    public static void main(String[] args) {
        // Creates two distinct objects with identical field values
        ObjectClass objectClass00 = new ObjectClass(45, 34.5f);  // New object at unique memory location
        ObjectClass objectClass01 = new ObjectClass(45, 34.5f);  // Another new object, different location

        // Assigns references to existing objects
        ObjectClass objectClass02 = objectClass00;  // Same object as objectClass00
        ObjectClass objectClass03 = objectClass01;  // Same object as objectClass01

        // Prints hash codes (likely different for distinct objects)
        System.out.println(objectClass00.hashCode());  // Unique hash for objectClass00
        System.out.println(objectClass01.hashCode());  // Different hash for objectClass01

        // Compares hash codes to check object identity
        if (objectClass00.hashCode() == objectClass01.hashCode()) {
            System.out.println("{objectClass00} and objectClass01, are the same object");
        } else {
            System.out.println("{objectClass00} and objectClass01, are different objects");  // Corrected output text

        }

        // Reference equality check: false since they’re distinct objects
        if (objectClass00 == objectClass01) {
            System.out.println("This won’t print; they’re different objects");  // Clarified message
        }

        // Default equals() check: true since objectClass00 and objectClass02 are the same object
        if (objectClass00.equals(objectClass02)) {
            System.out.println("True: Same object (reference equality)");
        }


        if (objectClass00.equals(objectClass01)) {
            System.out.println("False: Different objects (default equals checks reference)");

        }
    }
}