package com.oop.functions;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Q: take an input of two number and print the sum

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int intNum1 = input.nextInt();

        System.out.println("Enter number 2: ");
        int intNum2 = input.nextInt();

        int sum = intNum1 + intNum2;

        System.out.println("Sum: " + sum);


    }
}
