package com.oop.Interfaces.NestedInterface;
/**
 * Implements `A.NestedInterface`, showing nested interfaces can be encapsulated within classes.
 */
public class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;  // Correct bitwise check for oddness
    }
}