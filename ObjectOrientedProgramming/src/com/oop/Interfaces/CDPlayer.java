package com.oop.Interfaces;

/**
 * The `CDPlayer` class implements the `Media` interface, providing concrete behavior for starting
 * and stopping a CD player. This demonstrates how interfaces allow different classes to implement
 * the same contract in unique ways, supporting the lecturer’s note on polymorphism via "one
 * interface, multiple methods."
 */
public class CDPlayer implements Media {
    /**
     * Implements `start()` from `Media`. Must be `public` to match the interface’s implicit access.
     */
    @Override
    public void start() {
        System.out.println("start the CD player");
    }

    /**
     * Implements `stop()` from `Media`. Must be `public`.
     */
    @Override
    public void stop() {
        System.out.println("stop the CD player");
    }
}