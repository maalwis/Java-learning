package com.oop.functions;

public class PassingArgument {
    public static void main(String[] args) {

        System.out.println(sumNum(2,4));
    }

    // passing the value of the numbers when you are calling the method in main() - we do that by parameters
    // whenever a sumNum() method is called with values, what ever value passed as first,
    // it will replace the value of num1, and value passed as second, it will replace the value of num2
    public static int sumNum(int num1, int num2) {
        return num1 + num2;
    }
}