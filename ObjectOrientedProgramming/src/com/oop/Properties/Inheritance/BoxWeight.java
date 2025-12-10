package com.oop.Properties.Inheritance;

/**
 * `BoxWeight` extends `Box`, adding a `weight` property. It demonstrates single inheritance and constructor chaining.
 */
public class BoxWeight extends Box {
    double weight;  // Subclass-specific property: weight

    /**
     * Default constructor: Sets weight to -1.
     * Your question about initializing `l`, `w`, `h`—`super()` implicitly calls `Box()`, setting them to -1.
     */
    public BoxWeight() {
        this.weight = -1;   // Initializes weight
        // `super()` is implicit, calling Box’s default constructor to set l, w, h to -1
        // Cannot access `v` here because it’s private in `Box`—your observation was correct
    }

    /**
     * Constructor with dimensions and weight: Initializes superclass fields via `super`.
     */
    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);     // Calls Box’s constructor to set l, w, h
        this.weight = weight; // Sets weight
    }

    /**
     * Constructor with all properties: Passes `v` to `Box` despite it being private.
     * Your question about `v`—it’s initialized by `Box`’s constructor, not `BoxWeight`.
     */
    public BoxWeight(double l, double w, double h, double v, double weight) {
        super(l, w, h, v);  // Calls Box’s constructor to set l, w, h, and private v
        this.weight = weight; // Sets weight
    }

    /**
     * Copy constructor: Copies another `BoxWeight` object.
     */
    public BoxWeight(BoxWeight boxWeight) {
        super(boxWeight);   // Calls Box’s copy constructor with the BoxWeight object (valid due to inheritance)
        this.weight = boxWeight.weight; // Copies weight
    }

    /**
     * Constructor for a cube with weight: Uses `Box`’s cube constructor.
     */
    public BoxWeight(double side, double weight) {
        super(side);        // Calls Box’s cube constructor to set l, w, h to side
        this.weight = weight; // Sets weight
    }
}