package com.oop.functions;

public class ForLoopScope {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // i can not access variable "i" outside the for loop like below
//        System.out.println(i);

    }
}
