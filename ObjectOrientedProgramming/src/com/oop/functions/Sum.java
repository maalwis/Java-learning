package com.oop.functions;

import java.util.Scanner;

public class Sum {
    // how does this work? we all know main() function that is going to run and run the sum() method.
    public static void main(String[] args) {
        // if you want to call sum() method, then you need to make sure sum() method is static
        // because "Non-static method 'sum()' cannot be referenced from a static context"
        // anything you want to use in static, that also has to be static
        sum(); // calling the sum() function
        int sum = sumTwo();
        // return type basically means, when you call the sum() method, what is value of this particular method is going to be.
        // when the sum() method finishes executing, sum() method call is going to hold a value.
        // value is going to be what ever you are going to return this sum() method
    }
    public static void sum() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int intNum1 = input.nextInt();

        System.out.println("Enter number 2: ");
        int intNum2 = input.nextInt();

        int sum = intNum1 + intNum2;

        System.out.println("Sum: " + sum);
    }

    public static int sumTwo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int intNum1 = input.nextInt();

        System.out.println("Enter number 2: ");
        int intNum2 = input.nextInt();

        return intNum1 + intNum2;
    }
}
