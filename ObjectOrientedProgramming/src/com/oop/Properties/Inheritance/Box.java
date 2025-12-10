package com.oop.Properties.Inheritance;

/**
 * The `Box` class is the superclass, defining basic properties of a box: length (`l`), width (`w`), height (`h`),
 * and a private volume (`v`). It includes multiple constructors for flexibility and a method to display information.
 */
public class Box {
    public double l;    // Public: accessible to subclasses and outside classes
    public double w;    // Public: accessible to subclasses and outside classes
    public double h;    // Public: accessible to subclasses and outside classes
    private double v;   // Private: not directly accessible by subclasses, enforcing encapsulation

    /**
     * Default constructor: Sets all fields to -1, including private `v`.
     * Implicitly calls `super()` (Object’s constructor), as `Box` has no explicit superclass.
     */
    Box() {
        this.l = -1;    // Initializes length to -1
        this.w = -1;    // Initializes width to -1
        this.h = -1;    // Initializes height to -1
        this.v = -1;    // Initializes private volume to -1 (accessible only within `Box`)
    }

    /**
     * Constructor for a cube: All dimensions are equal.
     * Your note questioned `super()` here—it calls `Object`’s constructor, not a problem since `Box` is top-level.
     */
    Box(double side) {
        super();        // Explicitly calls Object’s constructor (optional, as it’s implicit)
        this.l = side;  // Sets length to the provided side value
        this.w = side;  // Sets width to the same value (cube property)
        this.h = side;  // Sets height to the same value
        this.v = -1;    // Volume remains un-calculated (-1), not set here
    }

    /**
     * Constructor with all properties, including private `v`.
     * Subclasses can’t access `v` directly but can pass it to this constructor via `super`.
     */
    Box(double l, double w, double h, double v) {
        this.l = l;     // Initializes length
        this.w = w;     // Initializes width
        this.h = h;     // Initializes height
        this.v = v;     // Initializes private volume
    }

    /**
     * Constructor with dimensions only: Demonstrates constructor overloading.
     * Prints a message to show it’s called.
     */
    Box(double l, double w, double h) {
        System.out.println("Box class constructor"); // Indicates this constructor is invoked
        this.l = l;     // Sets length
        this.w = w;     // Sets width
        this.h = h;     // Height initialized; `v` remains uninitialized (default 0.0 for double)
    }

    /**
     * Copy constructor: Creates a new `Box` by copying another `Box`’s fields.
     * Can access `v` because it’s within the same class.
     */
    Box(Box old) {
        this.l = old.l; // Copies length from the provided Box object
        this.w = old.w; // Copies width
        this.h = old.h; // Copies height
        this.v = old.v; // Copies private volume (accessible within `Box`)
    }

    /**
     * Method to display information: Can be overridden by subclasses.
     * Not `final`, so it’s inheritable and modifiable.
     */
    public void displayInformation() {
        System.out.println("Running the box"); // Simple output; subclasses can redefine this
    }
}
