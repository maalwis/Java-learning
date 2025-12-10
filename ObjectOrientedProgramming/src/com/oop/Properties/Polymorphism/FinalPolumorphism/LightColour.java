package com.oop.Properties.Polymorphism.FinalPolumorphism;

/**
 * This subclass extends `Colour` and overrides `colourType()` if it’s not `final`. It
 * also defines a static `coloring()` method, which hides (not overrides) the static
 * method in `Colour`. Static methods are resolved at compile time based on the reference
 * type, not runtime polymorphism.
 *
 * Correction: Your `colourType()` output says "Colour Class," which is incorrect—it
 * should reflect `LightColour`’s implementation.
 */
public class LightColour extends Colour {
    /**
     * Overrides `colourType()` from `Colour` (unless `final` is added there). Runs for
     * `LightColour` objects.
     */
    void colourType() {
        System.out.println("LightColour Class"); // Corrected from "Colour Class"
    }

    /**
     * Hides the static `coloring()` method in `Colour`. This is not overriding because
     * static methods are not polymorphic—they’re bound to the class, not the object.
     */
    static void coloring() {
        System.out.println("this is colouring() method in the LightColour class");
    }
}