package com.oop.Properties.Inheritance;

/**
 * `BoxDense` extends `Box`, adding a `density` (`d`) property. It demonstrates single inheritance and `super` usage.
 */
public class BoxDense extends Box {
    public double d;    // Subclass-specific property: density

    /**
     * Constructor with all properties: Initializes superclass fields via `super` and then the subclass field.
     * Your note about `super` meaning "directly above" is correct—it refers to `Box`.
     */
    public BoxDense(double l, double w, double h, double v, double d) {
        super(l, w, h, v);  // Calls Box’s constructor to initialize l, w, h, and private v
        this.d = d;         // Initializes density after superclass fields (order matters)
        // Note: `super` must be the first statement; `this.d` can’t precede it
    }

    /**
     * Copy constructor: Copies another `BoxDense` object.
     * <p>
     * Your question about passing `BoxDense` to `super` is valid—it works because `BoxDense` is-a `Box`, and `Box` has a constructor accepting a `Box` object.
     */
    public BoxDense(BoxDense boxDense) {
        super(boxDense);    // Calls Box’s copy constructor (`Box(Box old)`), passing the BoxDense object (valid due to inheritance)
        this.d = boxDense.d; // Copies the density from the provided BoxDense object
    }
}