package com.oop.functions;

import java.util.Arrays;

public class FunctionOverLoading {
    public static void main(String[] args) {
        func();
        func(56);
        func("John");
        varArgs(12,3,566,745,45,34,34,2,23,23,23,23,45,56);
        varArgs("sdfsdf","ssdsd","sdfs","sdfsf");

//        varArgs(); // this will not run because of ambiguity
    }

    public static void func() {
        System.out.println("No Parameters in the method");
    }

    public static void func(int a) {
        System.out.println("int parameter in the method " + a);

    }

    public static void func(String name) {
        System.out.println("String parameter in the method " + name);

    }

    public static void varArgs(int ...v) {
        System.out.println(Arrays.toString(v));

    }

    public static void varArgs(String ...v) {
        System.out.println(Arrays.toString(v));

    }

}
