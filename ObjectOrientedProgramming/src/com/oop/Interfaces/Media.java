package com.oop.Interfaces;

/**
 * The `Media` interface defines methods for controlling media playback, such as starting and
 * stopping. It provides a simple contract that classes like `CDPlayer` must implement, illustrating
 * how interfaces enable multiple classes to share a common set of methods. This aligns with the
 * lecturer’s note that "a class can implement more than one interface," facilitating flexible design.
 */
public interface Media {
    /**
     * Abstract method to start media playback. Implicitly `public` and `abstract`, requiring
     * implementation by any class that adopts this interface.
     */
    void start();

    /**
     * Abstract method to stop media playback. Implicitly `public` and `abstract`.
     */
    void stop();
}