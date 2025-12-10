package com.oop.Statics;

/**
 * The `Human` class illustrates the use of static members in Java. Static variables, such as `population`, belong to the class itself rather than any individual object, meaning all instances of `Human` share the same `population` value. The static `message` method can be invoked without creating an instance, emphasizing that static members are tied to the class level. The constructor increments `population` each time a new `Human` object is created, demonstrating how static variables track shared state across all instances.
 */
public class Human {
    String name;
    int age;
    float height;
    float weight;
    static long population;

    public static void message() {
        System.out.println("static message() method in Human class");

    }

    public Human(String name, int age, float height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Human.population += 1;
    }
}