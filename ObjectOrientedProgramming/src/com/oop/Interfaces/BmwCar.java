package com.oop.Interfaces;

/**
 * The `BmwCar` class uses composition to incorporate `Engine` and `Media` functionalities, rather
 * than implementing these interfaces directly. This design decouples `BmwCar` from specific
 * implementations, allowing it to work with any class that implements `Engine` or `Media` (e.g.,
 * `PowerEngine`, `ElectricEngine`, `CDPlayer`). The ability to upgrade the engine at runtime
 * showcases polymorphism and flexibility, contrasting with the lecturer’s note on multiple
 * inheritance issues, where a subclass cannot choose between conflicting implementations. Your
 * code avoids such ambiguity by using composition instead of multiple interface implementation.
 */
public class BmwCar {
    /**
     * Private field `engine` holds a reference to an `Engine` implementation. Using an interface
     * type promotes polymorphism, as any `Engine` implementation can be assigned.
     */
    private Engine engine;

    /**
     * Private field `media` holds a reference to a `Media` implementation. This encapsulates the
     * media functionality within the car.
     */
    private Media media;

    /**
     * Default constructor initializes `engine` and `media` with specific implementations. This
     * hardcodes the default behavior but can be overridden via the parameterized constructor.
     */
    public BmwCar() {
        this.engine = new PowerEngine();  // Default engine implementation
        this.media = new CDPlayer();      // Default media implementation
    }

    /**
     * Parameterized constructor allows dependency injection of an `Engine` implementation,
     * enhancing flexibility. Note that `media` is not initialized here, which is an oversight;
     * it should either be initialized or explicitly set later to avoid null references.
     */
    public BmwCar(Engine engine) {
        this.engine = engine;  // Injects the provided engine
        this.media = new CDPlayer();  // Added for consistency; originally missing
    }

    /**
     * Delegates the `start()` call to the `engine` instance, demonstrating how behavior is
     * determined by the current implementation of `Engine`.
     */
    public void start() {
        engine.start();  // Polymorphic call to the engine's start method
    }

    /**
     * Delegates the `stop()` call to the `engine` instance.
     */
    public void stop() {
        engine.stop();  // Polymorphic call to the engine's stop method
    }

    /**
     * Delegates the `start()` call to the `media` instance, distinct from the engine’s start.
     */
    public void startMusic() {
        media.start();  // Calls start on the media implementation
    }

    /**
     * Delegates the `stop()` call to the `media` instance.
     */
    public void stopMusic() {
        media.stop();  // Calls stop on the media implementation
    }

    /**
     * Replaces the current `engine` with an `ElectricEngine`, showing how composition allows
     * runtime behavior changes without altering the class structure.
     */
    public void upgradeEngine() {
        this.engine = new ElectricEngine();  // Updates engine to a new implementation
    }
}