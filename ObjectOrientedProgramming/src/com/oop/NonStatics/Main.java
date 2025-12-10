package com.oop.NonStatics;

/**
 * This class highlights the distinction between static and non-static members in Java. Non-static methods, such as `func` and `func01`, belong to an instance of the class and require an object to be called, whereas static methods, like `func00`, belong to the class itself and can be invoked directly. The `main` method demonstrates this by creating objects to access non-static methods, while also showing that static methods can be called from non-static contexts, but not vice versa without an instance.
 */
public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.func();

        Main obj00 = new Main();
        obj00.func01();
    }

    public void func() {
        System.out.println("This is a non-static method in the Main class");
        func00();
    }

    public static void func00() {
    }

    public void func01() {
        func();
    }
}