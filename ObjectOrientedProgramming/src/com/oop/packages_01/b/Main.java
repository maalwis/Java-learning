package com.oop.packages_01.b;

/**
 * This `Main` class is defined within the package `com.oop.packages.b`, a different namespace from other packages like `com.oop.packages.a`. Despite having the same class name as the `Main` class in package `a`, there is no conflict because packages create separate scopes. This illustrates how Java uses packages to manage class names and maintain clarity across a codebase.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello java from package b");
    }
}
