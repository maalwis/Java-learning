package com.oop.functions;

public class DoWhileLoops {

    public static void main(String[] args) {
        int number = 1;

        do {
            System.out.println("number of times this is going to execute: " + number);
            number = 1 + number;

        } while (number != 5);
    }
}
