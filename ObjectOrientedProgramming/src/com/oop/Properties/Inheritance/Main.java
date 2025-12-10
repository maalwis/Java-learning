package com.oop.Properties.Inheritance;

/**
 * `Main` demonstrates inheritance concepts: object creation, superclass references, and member access.
 */
public class Main {
    public static void main(String[] args) {
        // Creating a Box object with all properties
        Box box00 = new Box(4.4, 5.4, 5.3, 56);
        // Using the copy constructor
        Box box01 = new Box(box00);
        System.out.println(box00.l + " " + box00.w + " " + box00.h); // Outputs: 4.4 5.4 5.3

        // Default BoxWeight object
        BoxWeight boxWeight00 = new BoxWeight();
        // BoxWeight with dimensions and weight
        BoxWeight boxWeight01 = new BoxWeight(12, 12, 12, 56);
        System.out.println(boxWeight00.weight + " " + boxWeight00.l + " " + boxWeight00.w + " " + boxWeight00.h); // Outputs: -1 -1 -1 -1
        System.out.println(boxWeight01.weight + " " + boxWeight01.l + " " + boxWeight01.w + " " + boxWeight01.h); // Outputs: 56 12 12 12

        // Superclass reference to subclass object
        Box box02 = new BoxWeight(12, 12, 12, 45);
        // Your question: how is this possible? `BoxWeight` is-a `Box`, so this is valid
        System.out.println(box02.l + " " + box02.w + " " + box02.h); // Outputs: 12 12 12
        // Cannot do: box02.weight (weight isn’t in Box, only accessible via BoxWeight reference)

        // Multilevel inheritance example
        BoxPrice boxPrice00 = new BoxPrice(5, 12, 23); // Creates a cube with weight 12, cost 23
    }
}