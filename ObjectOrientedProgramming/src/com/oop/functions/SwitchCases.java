package com.oop.functions;

public class SwitchCases {

    public static void main(String[] args) {

        /**
         * Explanation of why 'fruit == "mango"' evaluates to true:
         *
         * - Memory Allocation:
         *   - 'fruit' is a reference variable on the stack, pointing to a String object in the heap.
         *   - "mango" is a String literal, stored in the String pool (a special area in the heap for String optimization).
         *
         * - String Pool Optimization:
         *   - When a String literal like "mango" is used, Java checks the String pool.
         *   - If "mango" already exists in the pool (from a previous assignment like 'String fruit = "mango"'),
         *     Java reuses that object instead of creating a new one.
         *   - Therefore, both 'fruit' and the literal "mango" in the comparison point to the same String object in the pool.
         */

        String fruit = "mango";
        switch (fruit) {
            case "mango":
                System.out.println("King of fruits");

                // Print identity hash codes to show both variables reference and "mango" are the same object
                // System.identityHashCode() provides a unique identifier based on the object's memory location
                System.out.println("fruit hash code: " + System.identityHashCode(fruit));
                System.out.println("mango String literal code: " + System.identityHashCode("mango"));

                break;
            case "Apple":
                System.out.println("Red Fruit");
                break;
            default:
                System.out.println(" ");
        }

        /**
         * This code demonstrates the behavior of String objects in Java, particularly when created with the 'new' keyword,
         * and how they interact with the String pool and switch statements.
         *
         * First, a String variable 'vegetable' is created using new String("carrot"). This creates a new String object
         * in the heap memory, separate from the String literal "carrot" which resides in the String pool.
         *
         * Then, a switch statement is used on 'vegetable'. In Java (since Java 7), switch on String uses the equals() method
         * for comparison, not the == operator. Therefore, even though 'vegetable' is a different object from the String
         * literal "carrot", the case "carrot" will match because their contents are equal.
         *
         * Inside the "carrot" case, it prints "rabbit likes carrots", which is just an example message.
         *
         * Then, it prints the identity hash code of 'vegetable' using System.identityHashCode(vegetable). This hash code is
         * based on the object's memory location and serves as a unique identifier for the object.
         *
         * Next, it prints the identity hash code of the String literal "carrot". Note that the print statement labels it as
         * Since 'vegetable' is a new object and "carrot" is the literal in the pool, their identity hash codes should be
         * different, indicating they are distinct objects.
         *
         * The break statement exits the switch.
         *
         * There are other cases ("leaks" and default), but since 'vegetable' is "carrot", only the "carrot" case executes.
         *
         * In summary, this code illustrates:
         * - Creating a String with 'new' generates a new object, distinct from the String pool.
         * - Switch on String uses equals(), matching based on content, not object reference.
         * - Identity hash codes (via System.identityHashCode()) reveal whether two references point to different objects.
         */

        String vegetable = new String("carrot"); // Creates a new String object in the heap, not using the String pool literal "carrot"

        switch (vegetable) {
            case "carrot": // Matches because vegetable.equals("carrot") is true, despite being different objects
                System.out.println("rabbit likes carrots"); // Prints an example message

                // Prints the identity hash code of the 'vegetable' object (new String("carrot"))
                System.out.println("fruit hash code: " + System.identityHashCode(vegetable));

                // Prints the identity hash code of the String literal "carrot" from the String pool
                // Note: Label says "mango", but it’s actually "carrot" — likely a typo
                System.out.println("mango String literal hash code: " + System.identityHashCode("carrot"));

                break; // Exits the switch block after executing this case
            case "leaks": // Would match if vegetable were "leaks", but it’s not in this case
                System.out.println("leaf kind of vegetables");
                break;
            default: // Executed if no case matches; not reached here since "carrot" matches
                System.out.println(" ");
        }


    }
}
