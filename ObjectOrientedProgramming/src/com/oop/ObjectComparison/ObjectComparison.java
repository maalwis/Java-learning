package com.oop.ObjectComparison;

/**
 * The `ObjectComparison` class implements the `Comparable` interface to define a natural ordering
 * based on the `objectFirstValue` field. This enables instances to be compared or sorted using
 * methods like `Collections.sort()`. The comparison considers only `objectFirstValue`, ignoring
 * `objectSecondValue`, which might be incomplete depending on the intended use case.
 *
 * Key Concepts:
 * - **Comparable**: Provides a way to compare objects naturally.
 * - **compareTo()**: Returns a negative, zero, or positive integer based on the comparison.
 */
public class ObjectComparison implements Comparable<ObjectComparison> {
    int objectFirstValue;  // First field for comparison, package-private by default
    float objectSecondValue;  // Second field, not used in comparison

    /**
     * Constructor initializes the fields.
     * @param objectFirstValue Integer value for comparison
     * @param objectSecondValue Float value, unused in comparison
     */
    public ObjectComparison(int objectFirstValue, float objectSecondValue) {
        this.objectFirstValue = objectFirstValue;  // Set first field
        this.objectSecondValue = objectSecondValue;  // Set second field
    }

    /**
     * Compares this object to another based on `objectFirstValue`.
     * @param o The object to compare with
     * @return Negative if less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(ObjectComparison o) {
        return this.objectFirstValue - o.objectFirstValue;  // Simple integer subtraction for comparison
    }

    /**
     * Demonstrates comparison functionality.
     */
    public static void main(String[] args) {
        ObjectComparison objectComparison00 = new ObjectComparison(3434, 2334f);  // First instance
        ObjectComparison objectComparison01 = new ObjectComparison(2323, 3445f);  // Second instance
        if (objectComparison00.compareTo(objectComparison01) < 0) {  // Compare the two
            System.out.println("objectComparison00 has less first value than objectComparison01");  // True case
        } else {
            System.out.println("objectComparison00 has more first value than objectComparison01");  // False case, but misses equality
        }
    }
}