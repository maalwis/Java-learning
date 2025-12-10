package com.oop.functions;

public class Shadowing {
    // what if I declare a variable in here. and this variable "x" will be available to every scope
    static int x = 12; // we are using static because we can not use object dependent on object independent methods like main() method.

    // main() method has it own scope
    public static void main(String[] args) {
        // i can use the variable "x" without an error
        System.out.println(x);  // this is going to print 12

//        what if i define a variable same name as "x" variable and give it a value
        int x = 134; // the class variable 'x' is shadowed by this. the local variable starts to shadowing (scope begins) the class
                    //  variable 'x' is when you initialized the variable 'x' (same name)
        System.out.println(x); // this is going to print 134

    }

    // so what is shadowing in java?
        // is a practice java using tow variables with the same name within the scope that overlaps.
        // when we initialized a variable as same as "x" (the higher level scope) is going to be hidden. that's why
        // when we do the int x = 134; in the main method and in the next line it prints 134 in the terminal. int x = 12; is going to be
        //  shadowed . lower level is overriding the upper level,

}
