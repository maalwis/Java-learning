package com.oop.packages_01.d;

import static com.oop.packages_01.c.Main.message;

/**
 * This class, situated in the package `com.oop.packages.d`, showcases the use of a static import to access the `message` method from the `com.oop.packages.c.Main` class. By using `import static`, the `message` method can be called directly without prefixing it with its class name, illustrating how static imports simplify access to static members across packages. This enhances code readability while leveraging the organizational structure of packages.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello java from package d");
        message();
    }
}
