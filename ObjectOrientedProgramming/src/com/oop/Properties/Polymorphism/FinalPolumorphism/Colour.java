package com.oop.Properties.Polymorphism.FinalPolumorphism;

/**
 * This class demonstrates the `final` keyword, which prevents method overriding when
 * applied to a method and prevents inheritance when applied to a class. If `colourType()`
 * were `final`, subclasses couldn’t override it, ensuring its behavior remains consistent.
 */
public class Colour {
    /**
     * Method that can be overridden unless marked `final`. Without `final`, subclasses
     * can redefine it.
     */
    void colourType() {
        System.out.println("Colour Class");
    }

    /**
     * Static method. Static methods belong to the class, not instances, and cannot be
     * overridden—they can only be hidden by a subclass’s static method with the same
     * signature.
     */
    static void coloring() {
        System.out.println("this is colouring() method in the Colour class");
    }
}