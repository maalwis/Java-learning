package com.oop.Introduction;

public class Wrapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer num = 45;

        final int INCREASE = 45;

        // Modify the "INCREASE variable value
        // INCREASE = 674; if you do this, this gives an error saying "Cannot assign a value to final variable 'INCREASE'"

        // if we try to call the swap() method to swap the values of "a" and "b", this is not reflect on here.
        // "a" and "b" will hold the same values as before. in java, primitives are not passed by reference nor
        // values of "a" and "b" are reside in the stack memory not heap memory.
        swap(a, b);
        System.out.println(a + " " + b);

        // but if the variables (reference variables) are pointing to objects, such as like this below.
        // Integers are objects that resides in the heap memory, 12 and 23 are reside in the heap memory.
        // "c" and "d" are reference variable that points to objects in the memory.
        Integer c = 12;
        Integer d = 23;

        // and if we try to swap the values of "c" and "d",will this  swapped?
        // because "c" and "d" are reference variables to objects, and when you pass them to swap(Integer c, Integer d) method,
        // you are not passing the copy of value of reference variable, but you are passing the copy of reference value to that method.
        swap(c, d);

        // seems like values of "c" and "d" did not swap?
        // seems like Integer class is a final class, that is why "c" and "d" did not swap.
        System.out.println(c + " " + d);

        A obj;

        for(int i = 0; i < 10000000; i++) {
            obj = new A("Random name");
        }

    }

    static void swap(int a, int b) {
        Integer temp = a;
        a = b;
        b = temp;

    }

    static void swap(Integer c, Integer d) {
        int temp = c;
        c = d;
        d = temp;

    }

}

class A {
    // what if you have a property as a final ?
    final int num =10;

    String name;

    public A(String name) {
        System.out.println("object is created");
        this.name = name;
    }


}









