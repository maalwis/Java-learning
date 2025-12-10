package com.oop.Interfaces;

/**
 * The `Main` class demonstrates the use of interfaces and their implementations. The commented code
 * highlights the ambiguity in `Car` when implementing multiple interfaces with overlapping methods,
 * while the active code shows `BmwCar` using composition to manage `Engine` and `Media` distinctly.
 * This reflects the lecturer’s note on interfaces supporting "dynamic method resolution at runtime"
 * and your observation of potential confusion in `Car`.
 */
public class Main {
    public static void main(String[] args) {
        // Commented section shows ambiguity in Car’s implementation
        /*
        Car car = new Car();
        car.accelerate();  // Works fine, unique to Engine
        car.start();       // Ambiguous: Engine or Media?
        car.stop();        // Ambiguous: Engine or Media?
        car.brake();       // Works fine, unique to Brake

        Engine car00 = new Car();
        Media carMedia = new Car();
        carMedia.start();  // Calls engine’s start, not media’s, as noted in your comment
        carMedia.stop();   // Calls engine’s stop, not media’s
        */

        /**
         * Creates a `BmwCar` instance with default `PowerEngine` and `CDPlayer`.
         */
        BmwCar bmwCar = new BmwCar();

        /**
         * Upgrades the engine to `ElectricEngine`, demonstrating runtime flexibility.
         */
        bmwCar.upgradeEngine();

        /**
         * Calls methods on `bmwCar`, showing clear separation of engine and media behavior.
         */
        bmwCar.start();       // Outputs: "power Electric Engine start"
        bmwCar.startMusic();  // Outputs: "start the CD player"
        bmwCar.stopMusic();   // Outputs: "stop the CD player"
        bmwCar.stop();        // Outputs: "power Electric Engine stop"
    }
}