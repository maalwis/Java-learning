package com.oop.Interfaces;

/**
 * The `Car` class implements three interfaces—`Engine`, `Brake`, and `Media`—demonstrating how
 * interfaces enable a class to adopt multiple behaviors, a key advantage over multiple inheritance
 * as per the lecturer’s notes. However, this design introduces ambiguity because `Engine` and
 * `Media` both define `start()` and `stop()` methods, and a single implementation serves both,
 * potentially confusing their intended purposes (e.g., starting the engine vs. media). Your `Main`
 * class comments correctly identify this issue, suggesting composition (as in `BmwCar`) as a
 * clearer alternative.
 */
public class Car implements Engine, Brake, Media {
    /**
     * Implements `brake()` from the `Brake` interface. Must be `public` to match the interface’s
     * implicit `public` access, as noted in the lecturer’s notes: "The methods that implement an
     * interface must be declared public."
     */
    @Override
    public void brake() {
        System.out.println("braking mechanism");
    }

    /**
     * Implements `start()` for both `Engine` and `Media` interfaces. This satisfies the contract
     * for both, but the output suggests it’s intended for the engine, highlighting the ambiguity
     * problem your `Main` class notes.
     */
    @Override
    public void start() {
        System.out.println("starting mechanism in the engine");
    }

    /**
     * Implements `stop()` for both `Engine` and `Media`. Like `start()`, it serves dual purposes,
     * which can lead to confusion as it’s engine-focused.
     */
    @Override
    public void stop() {
        System.out.println("stop mechanism in the engine");
    }

    /**
     * Implements `accelerate()` from the `Engine` interface. No ambiguity here, as it’s unique to
     * `Engine`.
     */
    @Override
    public void accelerate() {
        System.out.println("accelerating mechanism in the engine");
    }
}