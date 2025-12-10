package com.oop.Generics;

import java.util.Arrays;

/**
 * A generic dynamic array list implementation similar to Java's ArrayList.
 * This class provides a simplified version of a dynamic array that automatically
 * resizes when the capacity is exceeded.
 *
 * @param <T> The type of elements stored in this list.
 */
public class CustomGenericArrayList<T> {

    /**
     * The underlying array that stores the list elements.
     * Although declared as Object[], it stores elements of type T.
     */
    private Object[] data;

    /**
     * The current number of elements in the list.
     */
    private int size = 0;

    /**
     * The default initial capacity of the list.
     */
    private static final int DEFAULT_SIZE = 10;

    /**
     * Constructs an empty Wildcards with the default capacity.
     */
    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    /**
     * Adds a new element to the end of the list.
     * If the underlying array is full, it resizes the array to accommodate additional elements.
     *
     * @param value The element to add.
     */
    public void add(T value) {
        if (isFull()) {
            // Resize the array if current capacity is reached.
            this.data = reSizeArrayList();
        }
        // Add the new element and increment the size.
        this.data[this.size] = value;
        this.size++;
    }

    /**
     * Removes and returns the last element from the list.
     *
     * @return The removed element.
     * @throws IllegalStateException if the list is empty.
     */
    @SuppressWarnings("unchecked")
    public T remove() {
        if (this.size == 0) {
            throw new IllegalStateException("Cannot remove from an empty list.");
        }
        // Retrieve the last element.
        T removed = (T) this.data[this.size - 1];
        // Clear the slot for garbage collection.
        this.data[this.size - 1] = null;
        // Decrement the size.
        this.size--;
        return removed;
    }

    /**
     * Retrieves the element at the specified index.
     *
     * @param index The index of the element to return.
     * @return The element at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= 0 && index < this.size) {
            return (T) this.data[index];
        }
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
    }

    /**
     * Returns the current number of elements in the list.
     *
     * @return The size of the list.
     */
    public int size() {
        return size;
    }

    /**
     * Replaces the element at the specified index with the specified element.
     *
     * @param index The index of the element to replace.
     * @param value The new element to be stored at the specified index.
     * @return The element previously at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    @SuppressWarnings("unchecked")
    public T set(int index, T value) {
        if (index >= 0 && index < this.size) {
            T oldValue = (T) this.data[index];
            this.data[index] = value;
            return oldValue;
        }
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
    }

    /**
     * Returns a string representation of the list.
     *
     * @return A string containing the current elements in the list and its size.
     */
    @Override
    public String toString() {
        // Only include the active portion of the array.
        return "Wildcards { " +
                "data = " + Arrays.toString(Arrays.copyOf(data, size)) +
                ", size = " + this.size +
                " }";
    }

    /**
     * Checks if the underlying array is full.
     *
     * @return true if the list has reached its capacity, false otherwise.
     */
    private boolean isFull() {
        return this.size == this.data.length;
    }

    /**
     * Creates a new array with twice the capacity of the current array,
     * and copies all existing elements into the new array.
     *
     * @return The new, larger array.
     */
    private Object[] reSizeArrayList() {
        Object[] newData = new Object[data.length * 2];
        // Copy each element from the old array to the new array.
        for (int i = 0; i < data.length; i++) {
            newData[i] = this.data[i];
        }
        return newData;
    }

    /**
     * Displays all the elements of the list by printing them to the console.
     */
    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.data[i]);
        }
    }

    /**
     * Main method to demonstrate and test the functionality of Wildcards.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        // Create an instance of CustomGenericArrayList with Integer as the generic type.
        CustomGenericArrayList<Integer> customArrayList = new CustomGenericArrayList<>();

        // Add elements to the list to test automatic resizing.
        for (int i = 1; i < 16; i++) {
            customArrayList.add(i);
        }

        // Print the list's current state.
        System.out.println(customArrayList.toString());

        // Demonstrate get, set, and remove operations.
        System.out.println("Element at index 5: " + customArrayList.get(5));
        System.out.println("Replacing element at index 5 with 100. Old value: " + customArrayList.set(5, 100));
        System.out.println("After setting, element at index 5: " + customArrayList.get(5));
        System.out.println("Removed element: " + customArrayList.remove());

        // Display all elements.
        customArrayList.display();
    }
}
