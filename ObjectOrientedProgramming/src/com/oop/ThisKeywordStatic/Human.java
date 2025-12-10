package com.oop.ThisKeywordStatic;

/**
 * The `Human` class explores the interplay between the `this` keyword and static members. The `this` keyword refers to the current instance of the class and is used in the constructor to differentiate instance variables from parameters. However, in the static `message` method, `this` cannot be used because static methods operate at the class level, not the instance level. The static `population` variable, shared across all `Human` instances, is accessed using the class name rather than `this`, reinforcing the distinction between instance and class scope.
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