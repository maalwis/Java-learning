package com.oop.functions;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
    }

    // you can not access variable "a" in the "random()" method. variable "a" and "b" are only accessible in "main()" method.
    static void random() {
//        System.out.println(a);

        int num = 20;

        // but I can access variable that is in the same method that is declared.
        // this is called first scope known as function scope
        System.out.println(num);
    }

    // in this example, variables in "main()" method are not changing because, there are not passed as reference but just copy of
    // the variable value.
    static void swap(int num1, int num2) {
        // whatever we do to the num1 and num2, this change will only valid in this function scope only and will not change variable
        // values in "a" and "b".
        int temp = num1;
        num1 = num2;
        num2 = temp;

    }
}
