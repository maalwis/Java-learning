package com.oop.functions;

public class PassByValueObjects {

    public static void main(String[] args) {

        /**
         * 1. In main:
         *  - Two string literals, "kamal" and "Nalani", are created and stored in the string pool,
         *    a special area in the heap memory where Java keeps string literals to optimize memory usage.
         *  - name01 and name02 are reference variables on the stack, pointing to these string objects in the pool.
         * */
        String name01 = "kamal";
        String name02 = "Nalani";

        /**
         * 2. Calling greetings(name01, name02):
         *  - Java uses pass-by-value for all method parameters. When you pass name01 and name02 to greetings,
         *    the references (memory addresses) are copied.
         *  - Inside greetings, the parameters name01 and name02 are new local variables that start by pointing
         *    to the same string objects as the originals: "kamal" and "Nalani".
         * */
        greetings(name01, name02);

        System.out.println(name01 + ", " + name02);
    }

    private static void greetings(String name01, String name02) {
        /**
         * 3. Inside greetings:
         *  - The assignment name01 = "hello kamal";:
         *  - "hello kamal" is a new string literal. Java creates a new String object in the string pool (assuming it doesn’t already exist there).
         *  - The local name01 reference is updated to point to this new object, "hello kamal".
         *
         *  - Similarly, name02 = "hello Nalani";:
         *  - "hello Nalani" is a new string literal, and a new String object is created in the string pool.
         *  - The local name02 reference now points to "hello Nalani".
         *
         * Key Point: These reassignments only affect the local copies of the references inside greetings.
         * The original references in main (name01 and name02) remain unchanged, still pointing to "kamal" and "Nalani".
         * */

        name01 = "hello kamal";     // does this create a new object in the heap memory (String pool)?
        // and assigns to the name01
        name02 = "hello Nalani";    // does this create a new object in the heap memory (String pool)?
        // and assigns to the name02

        // how do you modify the original values?

        System.out.println(name01 + ", " + name02);
    }
}
