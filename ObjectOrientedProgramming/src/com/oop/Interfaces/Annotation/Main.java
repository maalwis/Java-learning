package com.oop.Interfaces.Annotation;
/**
 * Implements `A` and `B`, resolving `func()` conflict by overriding it.
 */
public class Main implements A, B {
    @Override
    public void greet() {}
    @Override
    public void func() {}  // Must override due to conflict
    public static void main(String[] args) {
        A.method();  // Calls static method
    }
}