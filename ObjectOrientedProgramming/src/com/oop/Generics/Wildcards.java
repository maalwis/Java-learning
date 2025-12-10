package com.oop.Generics;

import java.util.Arrays;

/**
 * The `Wildcards` class demonstrates generics in Java by implementing a simple dynamic array similar
 * to `ArrayList`. It uses a generic type parameter `T` bounded by `Number`, meaning it can only hold
 * types that extend `Number` (e.g., `Integer`, `Double`). Internally, it uses an `Object[]` array to
 * store elements due to type erasure, a process where generic type information is removed at runtime.
 * The class provides methods to add, remove, get, and set elements, with automatic resizing when the
 * array is full. Despite its name, it does not use wildcards (`?`); instead, it employs a bounded type
 * parameter, which is a common source of confusion.
 *
 * Key Concepts:
 * - **Generics**: Enable type safety by parameterizing the class with `T`.
 * - **Bounded Type Parameter**: `<T extends Number>` restricts `T` to `Number` subclasses.
 * - **Type Erasure**: At runtime, `T` becomes `Object`, requiring casts when retrieving elements.
 * - **Dynamic Resizing**: The array doubles in size when full, mimicking standard collection behavior.
 */
public class Wildcards<T extends Number> {

    private Object[] data;  // Internal array to store elements; `Object[]` used due to type erasure
    private int size = 0;   // Tracks the number of elements currently stored
    private static final int DEFAULT_SIZE = 10;  // Initial capacity of the array

    /**
     * Constructor initializes the array with the default size.
     */
    public Wildcards() {
        this.data = new Object[DEFAULT_SIZE];  // Creates an empty array of size 10
    }

    /**
     * Adds an element to the end of the list, resizing if necessary.
     * @param value The element to add, of type `T`
     */
    public void add(T value) {
        if (isFull()) {  // Check if the array has reached capacity
            this.data = reSizeArrayList();  // Resize to double the current capacity
        }
        this.data[this.size] = value;  // Store the element at the current size index
        this.size++;  // Increment size to reflect the new element
    }

    /**
     * Removes and returns the last element. Throws an exception if the list is empty.
     * @return The removed element
     */
    @SuppressWarnings("unchecked")
    public T remove() {
        if (this.size == 0) {  // Check if the list is empty
            throw new IllegalStateException("Cannot remove from an empty list.");  // Proper exception for empty state
        }
        T removed = (T) this.data[this.size - 1];  // Cast required due to `Object[]`; retrieves last element
        this.data[this.size - 1] = null;  // Clear the slot for garbage collection
        this.size--;  // Decrease size to reflect removal
        return removed;  // Return the removed element
    }

    /**
     * Retrieves an element at the specified index.
     * @param index The index to access
     * @return The element at the index
     */
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= 0 && index < this.size) {  // Validate index bounds
            return (T) this.data[index];  // Cast to `T` from `Object`
        }
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");  // Proper exception for invalid index
    }

    /**
     * Returns the current number of elements.
     * @return The size
     */
    public int size() {
        return size;  // Simply returns the current size
    }

    /**
     * Replaces an element at the specified index and returns the old value.
     * @param index The index to modify
     * @param value The new value
     * @return The previous value at the index
     */
    @SuppressWarnings("unchecked")
    public T set(int index, T value) {
        if (index >= 0 && index < this.size) {  // Validate index bounds
            T oldValue = (T) this.data[index];  // Cast and store old value
            this.data[index] = value;  // Replace with new value
            return oldValue;  // Return the old value
        }
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");  // Exception for invalid index
    }

    /**
     * Returns a string representation of the active elements.
     */
    @Override
    public String toString() {
        return "Wildcards { " +
                "data = " + Arrays.toString(Arrays.copyOf(data, size)) +  // Copy only active elements
                ", size = " + this.size +
                " }";
    }

    /**
     * Checks if the array is full.
     * @return True if size equals capacity, false otherwise
     */
    private boolean isFull() {
        return this.size == this.data.length;  // Compares current size to array length
    }

    /**
     * Resizes the array to double its current capacity.
     * @return The new array
     */
    private Object[] reSizeArrayList() {
        Object[] newData = new Object[data.length * 2];  // Create new array with doubled size
        for (int i = 0; i < data.length; i++) {  // Copy all existing elements
            newData[i] = this.data[i];
        }
        return newData;  // Return the new array
    }

    /**
     * Displays all elements by printing them.
     */
    public void display() {
        for (int i = 0; i < this.size; i++) {  // Iterate only over active elements
            System.out.println(this.data[i]);  // Print each element
        }
    }

    /**
     * Demonstrates the class functionality.
     */
    public static void main(String[] args) {
        Wildcards<Integer> customArrayList = new Wildcards<>();  // Instantiate with `Integer` type
        for (int i = 1; i < 16; i++) {  // Add 15 elements to trigger resizing (initial capacity is 10)
            customArrayList.add(i);
        }
        System.out.println(customArrayList.toString());  // Print the list
        System.out.println("Element at index 5: " + customArrayList.get(5));  // Get element at index 5
        System.out.println("Replacing element at index 5 with 100. Old value: " + customArrayList.set(5, 100));  // Set and show old value
        System.out.println("After setting, element at index 5: " + customArrayList.get(5));  // Verify new value
        System.out.println("Removed element: " + customArrayList.remove());  // Remove and show last element
        customArrayList.display();  // Display all elements
    }
}