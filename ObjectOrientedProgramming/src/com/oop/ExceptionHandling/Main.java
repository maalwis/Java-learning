package com.oop.ExceptionHandling;

/**
 * The `Main` class demonstrates exception handling in Java, focusing on `ArithmeticException` for
 * division by zero. It uses `try`, `catch`, and `finally` blocks to handle errors gracefully,
 * preventing program crashes. The `divide` method explicitly throws an exception, showcasing
 * exception propagation and handling.
 *
 * Key Concepts:
 * - **Exception Handling**: Manages runtime errors with `try-catch`.
 * - **Unchecked Exceptions**: `ArithmeticException` is a runtime exception, not required to be declared.
 * - **Finally**: Executes regardless of exception occurrence, useful for cleanup.
 */
public class Main {

    public static void main(String[] args) {
        int a = 5;  // Numerator
        int b = 0;  // Denominator, will cause division by zero

        try {  // Try block for general exception catching
            int c = divide(a, b);  // Attempt division
        } catch (Exception e) {  // Catch any exception
            System.out.println(e.getMessage());  // Print "Do not pass 0"
        }

        try {  // Try block for specific exception
            int c = divide(a, b);  // Attempt division
        } catch (ArithmeticException e) {  // Catch only ArithmeticException
            System.out.println(e.getMessage());  // Print "Do not pass 0"
        }

        try {  // Try block with finally
            int c = divide(a, b);  // Attempt division
        } catch (ArithmeticException e) {  // Catch ArithmeticException
            System.out.println(e.getMessage());  // Print "Do not pass 0"
        } finally {  // Always executes
            System.out.println("No matter what this executes");  // Cleanup or final action
        }

        try {  // Try block with multiple catches
            int c = divide(a, b);  // Attempt division
        } catch (ArithmeticException e) {  // Specific catch first
            System.out.println(e.getMessage());  // Print "Do not pass 0"
        } catch (Exception e) {  // General catch second (not reached here)
            System.out.println("Normal Exception");  // Broader exception type
        } finally {  // Always executes
            System.out.println("No matter what this executes");  // Final action
        }
    }

    /**
     * Divides two integers, throwing an exception if denominator is zero.
     * @param a Numerator
     * @param b Denominator
     * @return Result of division
     * @throws ArithmeticException If b is 0
     */
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {  // Check for division by zero
            throw new ArithmeticException("Do not pass 0");  // Throw custom message exception
        }
        return a / b;  // Perform division
    }
}