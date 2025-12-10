package com.oop.functions;

/**
 * This class demonstrates how Java handles String literals, memory allocation,
 * and the String pool. It compares two String references and retrieves their
 * identity hash codes to illustrate memory behavior.
 */
public class StringLiterals {
    public static void main(String[] args) {
        /**
         * Stack Memory:
         * - Stores local variables such as 'fruit' and 'mango'.
         * - These variables hold references (memory addresses) to objects in the heap.
         * - Memory is temporary and cleared when the method ends.
         *
         * Heap Memory:
         * - Stores all objects, including String literals like "mango".
         * - Contains the String pool, a special area that optimizes memory by reusing identical String literals.
         *
         *  String Pool and Memory Allocation:
         *  - Java optimizes memory usage for String literals (strings defined directly with quotes, like "mango")
         *    using a special area in the heap called the String pool (also known as the String constant pool).
         *
         *  - Here’s how it works:
         *      1. when you write String fruit = "mango"; :
         *          - Java checks the String Pool to see if "mango" exists
         *          - If it doesn’t, a new String object with the value "mango" is created in the pool.
         *          - The reference variable fruit (on the stack) is assigned the address of this "mango"
         *            object in the heap.
         *
         *      2. When you write String mango = "mango";:
         *          - Java again checks the String pool.
         *          - Since "mango" already exists (from the previous step), Java doesn’t create a new object.
         *            Instead, it reuses the existing "mango" object.
         *          - The reference variable mango (also on the stack) is assigned the same address as fruit.
         *
         *  This reuse of identical String literals is an optimization to save memory. As a result,
         *  both fruit and mango reference the same "mango" object in the heap.
         *
         *  If If you had created separate objects using the new keyword, like this below,
         *  Then fruit == mango would be false, because new forces the creation of distinct objects in the heap,
         *  even if their contents are identical. But with literals, the pool keeps them unified.
         *
         *      String fruit = new String("mango");
         *      String mango = new String("mango");
         *
         */

        // 'fruit' and 'mango' are reference variables on the stack, pointing to the same "mango" object
        // in the String pool (a section of the heap).
        String fruit = "mango"; // Creates or reuses "mango" in the String pool
        String mango = "mango"; // Reuses the existing "mango" from the pool

        // Print identity hash codes to show both variables reference the same object
        // System.identityHashCode() provides a unique identifier based on the object's memory location
        System.out.println("fruit hash code: " + System.identityHashCode(fruit));
        System.out.println("mango hash code: " + System.identityHashCode(mango));

        // Check if 'fruit' and 'mango' point to the same object in the heap
        // '==' compares references, not content; prints "yes" because they share the same String pool object
        if (fruit == mango) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


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
         *
         * - Reference Comparison:
         *   - The '==' operator compares the references (memory addresses) of the two objects, not their content.
         *   - Since both 'fruit' and "mango" reference the same object in the String pool, 'fruit == "mango"' returns true.
         *
         * - Important Notes:
         *   - This behavior is specific to String literals due to the String pool. If a new String object were created
         *     using 'new String("mango")', it would be a distinct object in the heap, and '==' would return false.
         *   - For comparing the content of Strings, it's generally safer to use the 'equals()' method, which checks
         *     the actual characters. However, in this case, since both are literals and point to the same object,
         *     '==' works as expected.
         *
         * - Best Practice:
         *   - Use '==' for String literals when you want to check if they are the same object (e.g., for performance
         *     in specific scenarios). For general content comparison, prefer 'equals()'.
         */

        // Print identity hash codes to show both variables reference and "mango" are the same object
        // System.identityHashCode() provides a unique identifier based on the object's memory location
        System.out.println("fruit hash code: " + System.identityHashCode(fruit));
        System.out.println("mango String literal code: " + System.identityHashCode("mango"));

        if (fruit == "mango") {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}