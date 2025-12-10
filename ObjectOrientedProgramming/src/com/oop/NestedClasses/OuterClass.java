package com.oop.NestedClasses;

/**
 * This class demonstrates the use of nested classes in Java, specifically focusing on the distinction between non-static inner classes and static nested classes.
 * Nested classes are classes defined within another class, and their behavior differs based on whether they are declared as static or non-static.
 * <p>
 * A **non-static inner class** (e.g., `InnerClass`) is tightly coupled to an instance of its outer class (`OuterClass`). This means that an object of `InnerClass` cannot exist independently; it requires an associated instance of `OuterClass`. Because of this dependency, `InnerClass` has an implicit reference to the outer class instance, allowing it to access both static and non-static members of `OuterClass`, including private ones. To instantiate `InnerClass`, you must first create an instance of `OuterClass` and then use that instance to create the inner class object, such as `OuterClass outer = new OuterClass(); InnerClass inner = outer.new InnerClass("first object");`. Attempting to instantiate `InnerClass` directly in a static context, like the `main` method, results in a compilation error because no outer instance is available.
 * <p>
 * In contrast, a **static nested class** (e.g., `InnerClass00`) is not tied to an instance of the outer class. It behaves more like a standalone class, nested within `OuterClass` for organizational purposes. Since it is declared `static`, it does not maintain an implicit reference to an `OuterClass` instance and can be instantiated independently, as shown in the `main` method with `new InnerClass00("third object")`. This independence makes static nested classes useful when you want a related class that does not require an outer instance to function.
 * <p>
 * The **key differences** between these two types of nested classes lie in their dependency and behavior. Non-static inner classes depend on an outer class instance, giving them access to all outer class members, while static nested classes do not have this dependency and can only directly access static members of the outer class. Instantiation also differs: non-static inner classes need an outer instance (e.g., `outer.new InnerClass()`), whereas static nested classes can be created directly (e.g., `new OuterClass.InnerClass00()`). This distinction affects their use cases—inner classes are ideal for tightly coupled relationships, while static nested classes suit more independent, utility-like roles.
 * <p>
 * The `main` method, being **static**, operates in a class-level context rather than an instance-level context. This means it cannot directly access non-static members or create instances of non-static inner classes without an explicit `OuterClass` object. This is why the commented-out lines attempting to instantiate `InnerClass` in `main` would fail—they lack the required outer instance. Conversely, `InnerClass00`, being a static nested class, can be instantiated directly in `main` without any issues, as demonstrated by the creation of `innerClass02` and `innerClass03`.
 * <p>
 * This example highlights the importance of understanding nested classes and static concepts in Java. Non-static inner classes emphasize instance-level relationships, while static nested classes provide flexibility and independence, impacting memory usage, instantiation, and design decisions in object-oriented programming.
 */
public class OuterClass {
    // InnerClass is dependent on the OuterClass object
    class InnerClass {
        String name;

        public InnerClass(String name) {
            this.name = name;
        }
    }

    // InnerClass00 is not dependent on OuterClass object
    static class InnerClass00 {
        String name;

        public InnerClass00(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // 'com.oop.innerClasses.OuterClass.this' cannot be referenced from a static context.
        // The "InnerClass" itself is dependent on the "OuterClass" object.
        // InnerClass innerClass00 = new InnerClass("first object");
        // InnerClass innerClass01 = new InnerClass("second object");

        InnerClass00 innerClass02 = new InnerClass00("third object");
        InnerClass00 innerClass03 = new InnerClass00("fourth object");

        System.out.println(innerClass02.name);
        System.out.println(innerClass03.name);
    }
}