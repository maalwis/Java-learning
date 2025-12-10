package com.oop.ExceptionHandling;

/**
 * The `CustomException` class extends `Exception` to create a custom checked exception. It aims to
 * demonstrate custom exception handling, but the `main` method has a logical flaw: it attempts
 * division before checking `b == 0`, causing an `ArithmeticException` to be thrown first, rendering
 * the custom exception unreachable in this context.
 *
 * Key Concepts:
 * - **Custom Exceptions**: Extend `Exception` for checked or `RuntimeException` for unchecked exceptions.
 * - **Throwing Exceptions**: Use `throw` to raise custom errors.
 */
public class CustomException extends Exception {

    /**
     * Constructor passes the message to the superclass.
     * @param message The error message
     */
    public CustomException(String message) {
        super(message);  // Initialize with custom message
    }

    public static void main(String[] args) {
        int a = 5;  // Numerator
        int b = 0;  // Denominator, causes division by zero

        try {  // Try block to catch exceptions
            int c = divide(a, b);  // This throws ArithmeticException first
            if (b == 0) {  // Check is too late; never reached
                throw new CustomException("b can not be zero");  // Intended custom exception
            }
        } catch (CustomException e) {  // Catch custom exception (not reached)
            System.out.println(e.getMessage());  // Would print "b can not be zero"
        } finally {  // Always executes
            System.out.println("No matter what this executes");  // Final action
        }
    }

    /**
     * Divides two integers, throwing an ArithmeticException if denominator is zero.
     * @param a Numerator
     * @param b Denominator
     * @return Result of division
     * @throws ArithmeticException If b is 0
     */
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {  // Check for division by zero
            throw new ArithmeticException("Do not pass 0");  // Throw standard exception
        }
        return a / b;  // Perform division
    }
}