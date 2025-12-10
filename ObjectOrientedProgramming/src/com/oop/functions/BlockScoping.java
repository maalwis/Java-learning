package com.oop.functions;

public class BlockScoping {

    public static void main(String[] args) {

        int a = 45;
        int x = 56;
        String name = "hello"; // name reference variable is pointing to the String object in the heap memory

        // if I write something like int variables like below inside the {},
        {
            // since I initialize the variable "a" outside of this block, this "a" gives me an error.
            // you cannot initialize the same variable again.
//            int a = 45; // but can assign values to variable "a" like this --> a = 67;
            int b = 23;
            int c = 34;
            x = 67; // I have assigned the variable "x" to a new value. (re-assign the original reference variable to some other value)
            // values that are initialized outside the block, can not be initialized in this block like you did variable "a".

            // same goes for String
            name = "hello world"; // now assign the reference variable into a new String object in the heap memory

        }
        // in the block {} i have assigned the variable "x" to a new value, will x be the values that is assigned in the block{}
        // or x be the 56?
        System.out.println(x); // this will print the newly assigned integer value in the block {}

        // this will print the newly assigned the String values : "hello world"
        System.out.println(name);


        // if i try to access variable "b" and "c" in here it will give me an error. because variable "b" and "c" are
        // initialized inside the block {}, you can not access them outside of that block {}.
        // values initialized in the block {}, will remain in the block
//        System.out.println(b); // can not use outside the block
//        System.out.println(c); // can not use outside the block
    }
}
