package com.oop.Interfaces;

/**
 * The `PowerEngine` class implements the `Engine` interface, providing behavior for a generic power
 * engine. It’s another example of how interfaces support multiple implementations, reinforcing
 * your notes on their role in abstraction.
 */
public class PowerEngine implements Engine {
    /**
     * Implements `start()` for a power engine. Must be `public`.
     */
    @Override
    public void start() {
        System.out.println("power engine start");
    }

    /**
     * Implements `stop()` for a power engine. Must be `public`.
     */
    @Override
    public void stop() {
        System.out.println("power engine stop");
    }

    /**
     * Implements `accelerate()` for a power engine. Must be `public`.
     */
    @Override
    public void accelerate() {
        System.out.println("power engine accelerate");
    }
}