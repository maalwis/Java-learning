package com.oop.ThisKeywordStatic;

/**
 * This `Main` class creates multiple `Human` objects to demonstrate how the static `population` variable is updated and accessed. Each instantiation of `Human` increments `population`, and since it is static, its value is consistent across all references to `Human.population`. This reinforces the concept that static members belong to the class, not individual objects, and can be accessed without an instance.
 */
public class Main {
    public static void main(String[] args) {
        Human human00 = new Human("name01", 24, 181, 72);
        Human human01 = new Human("name01", 25, 182, 73);
        Human human02 = new Human("name01", 26, 183, 74);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}