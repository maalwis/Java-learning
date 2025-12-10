package com.oop.packages_01.a;

/**
 * This class demonstrates the concept of packages in Java, which are used to organize classes and prevent naming conflicts. By placing this `Main` class in the package `com.oop.packages.a`, it resides in a unique namespace corresponding to the directory structure `com/oop/packages/a/`. This allows multiple classes named `Main` to exist in different packages without clashing, showcasing how packages provide modularity and organization in larger projects.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello java from package a");
    }
}
