package com.oop.Statics;

/**
 * This `Main` class demonstrates the behavior of static variables by creating multiple `Human` objects and accessing the shared `population` variable. Each time a `Human` object is instantiated, the constructor increments `population`, and because it is static, all references to `Human.population` reflect the same updated value. This shows how static members maintain a single, class-wide state regardless of the number of instances created.
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