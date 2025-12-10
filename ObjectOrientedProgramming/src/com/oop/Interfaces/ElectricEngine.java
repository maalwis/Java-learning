package com.oop.Interfaces;

/**
 * The `ElectricEngine` class implements the `Engine` interface, offering a specific implementation
 * for electric engines. This showcases polymorphism, where different engine types can be used
 * interchangeably as long as they adhere to the `Engine` contract, aligning with the lecturer’s
 * emphasis on dynamic method resolution.
 */
public class ElectricEngine implements Engine {
    /**
     * Implements `start()` for an electric engine. Must be `public`.
     */
    @Override
    public void start() {
        System.out.println("power Electric Engine start");
    }

    /**
     * Implements `stop()` for an electric engine. Must be `public`.
     */
    @Override
    public void stop() {
        System.out.println("power Electric Engine stop");
    }

    /**
     * Implements `accelerate()` for an electric engine. Must be `public`.
     */
    @Override
    public void accelerate() {
        System.out.println("power Electric Engine accelerate");
    }
}