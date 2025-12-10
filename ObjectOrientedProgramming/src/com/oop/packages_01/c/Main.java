package com.oop.packages_01.c;

/**
 * This class, located in the package `com.oop.packages.c`, includes both a `main` method and a static `message` method. The `message` method is designed to be accessible from other packages via static import, demonstrating how packages not only organize code but also control access to class members. The static nature of `message` allows it to be called without instantiating the class, highlighting a key feature of package-based visibility.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello java from package c");
    }

    public static void message() {
        System.out.println("this function is inside com.oop.packages.c package");
    }
}
