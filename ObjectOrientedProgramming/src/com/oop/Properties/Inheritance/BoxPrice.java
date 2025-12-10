package com.oop.Properties.Inheritance;

/**
 * `BoxPrice` extends `BoxWeight`, adding a `cost` property. It showcases multilevel inheritance: `Box → BoxWeight → BoxPrice`.
 */
public class BoxPrice extends BoxWeight {
    public double cost; // Subclass-specific property: cost

    /**
     * Default constructor: Initializes cost to -1.
     * <p>
     * Implicitly calls `BoxWeight()` via `super()`, which in turn calls `Box()`.
     */
    public BoxPrice() {
        super();        // Calls BoxWeight’s default constructor (implicit if omitted)
        this.cost = -1; // Sets cost to -1
    }

    /**
     * Copy constructor: Copies another `BoxPrice` object.
     * <p>
     * Uses `super` to invoke `BoxWeight`’s copy constructor.
     */
    public BoxPrice(BoxPrice boxPrice) {
        super(boxPrice);    // Calls BoxWeight’s copy constructor, passing the BoxPrice object (valid due to inheritance)
        this.cost = boxPrice.cost; // Copies the cost
    }

    /**
     * Constructor with all properties: Initializes superclass fields and then cost.
     */
    public BoxPrice(double l, double w, double h, double v, double weight, double cost) {
        super(l, w, h, v, weight); // Calls BoxWeight’s constructor to set inherited fields
        this.cost = cost;          // Sets the subclass-specific cost
    }

    /**
     * Constructor for a cube with weight and cost: Leverages `BoxWeight`’s cube constructor.
     */
    public BoxPrice(double side, double weight, double cost) {
        super(side, weight); // Calls BoxWeight’s constructor for a cube with weight
        this.cost = cost;    // Sets cost
    }
}