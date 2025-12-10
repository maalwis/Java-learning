package com.oop.Properties.Polymorphism;

/**
 * This class demonstrates compile-time polymorphism, also known as static polymorphism,
 * through method overloading. Method overloading allows a class to have multiple methods
 * with the same name but different parameter lists (differing in number, type, or order of
 * parameters). The Java compiler determines which method to invoke at compile time based
 * on the method signature (name and parameters), not the return type. This is why it’s
 * called "static" polymorphism—resolution happens before runtime.
 *
 * "return types can distinguish" overloaded methods, but this is incorrect. The return type
 * alone cannot differentiate overloaded methods; the parameter list is what matters.
 * For example, two methods with the same name and parameters but different return
 * types will cause a compilation error.
 */
public class Number {
    /**
     * Method to add two integers. This is one version of the overloaded 'sum' method.
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b as an integer
     */
    int sum(int a, int b) {
        return a + b;
    }

    /**
     * Overloaded method to add a double and an integer. The parameter types differ from
     * the previous method, allowing the compiler to distinguish it.
     * @param a First number as a double
     * @param b Second number as an integer
     * @return Sum of a and b as a double
     */
    double sum(double a, int b) {
        return a + b;
    }

    /**
     * Overloaded method to add three integers. The number of parameters differs,
     * making it distinct from other 'sum' methods.
     * @param a First integer
     * @param b Second integer
     * @param c Third integer
     * @return Sum of a, b, and c as an integer
     */
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Overloaded method to print a message combining an integer and a string.
     * The parameter types and order differ from other 'sum' methods.
     * @param a An integer
     * @param b A string to append
     */
    void sum(int a, String b) {
        System.out.println("you number is " + a + b);
    }

    /**
     * Overloaded method to print a message combining a string and an integer.
     * The order of parameters (String, int) differs from the (int, String) version.
     * @param a A string to append
     * @param b An integer
     */
    void sum(String a, int b) {
        System.out.println("you number is " + b + a);
    }

    public static void main(String[] args) {
        // Creates an instance of Number. Your note says "Java decides which constructor
        // to call at compile time and memory allocation happens at runtime." This is
        // partially correct: constructor overloading is resolved at compile time, but
        // here, the default constructor is implicitly called since none is defined.
        Number obj = new Number();

        // Calls sum(int, int). The compiler resolves this to the two-integer version
        // based on the argument types (int, int).
        obj.sum(1, 3);

        // Calls sum(int, int, int). The compiler selects this based on three int arguments.
        obj.sum(1, 3, 5);

        // Calls sum(String, int). The compiler matches the String and int arguments.
        obj.sum("D", 233);

        // Calls sum(int, String). The compiler matches the int and String arguments.
        obj.sum(345, "AB");
    }
}