package com.oop.Interfaces.Annotation;

public interface A {
    // static interface methods should always have a body and call via the interface name
    static void method() {
        System.out.println("static interface method in [interface A]");
    }


    default void func() {
        System.out.println("Default implementation");
    }
}
