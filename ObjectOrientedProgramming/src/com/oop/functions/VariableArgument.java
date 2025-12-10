package com.oop.functions;

import java.util.Arrays;

public class VariableArgument {
    public static void main(String[] args) {
        function(1,2,3,4);
        multipleArguments(12,23,34,56,56,56,56,5656,56,565,65,656,56);
    }

    // variable length arguments
    public static void function(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    // normal and keyword arguments
    public static void  multipleArguments(int a, int b, int c, int ...v) {
        System.out.println(Arrays.toString(v));
    }

}
