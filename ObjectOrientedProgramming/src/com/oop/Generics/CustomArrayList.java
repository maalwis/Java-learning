package com.oop.Generics;

import java.util.ArrayList;
import java.util.Arrays;

// by default this is an integer array (private int[] data;), this can only store integer but
// is this ture for in-built ArrayList? in the in-built ArrayList, you can store any type of data
// (every datatype in the java and custom data types) type you want. in-built ArrayList provide this
// functionality
// ArrayList<Integer> list = new ArrayList<>();
// <Integer> <-- this is known as generic (parameterized)

/**
 * CustomArrayList is a custom implementation of a dynamic array that automatically
 * resizes when it becomes full. It is designed to store integer values.
 */
public class CustomArrayList {
    /**
     * The underlying array that stores the integer elements.
     */
    private int[] data;

    /**
     * The current number of elements stored in the list.
     */
    private int size = 0;

    /**
     * The default initial capacity of the list.
     */
    private static int DEFAULT_SIZE = 10;

    /**
     * Constructor for CustomArrayList.
     * <p>
     * Initializes the internal array with a capacity defined by DEFAULT_SIZE.
     * </p>
     */
    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    /**
     * Adds a new value to the list.
     * <p>
     * If the list is full, the array is resized (doubled in capacity) before adding the element.
     * The new value is then inserted at the index indicated by 'size', and 'size' is incremented.
     * </p>
     *
     * @param value The integer value to be added to the list.
     */
    public void add(int value) {
        if (isFull()) {
            // Resize the array if the current capacity is reached.
            this.data = reSizeArrayList();
        }
        // Insert the new value at the current 'size' index.
        this.data[this.size] = value;
        // Increment 'size' to reflect the addition of a new element.
        this.size++;
    }

    /**
     * Removes and returns the last element from the list.
     * <p>
     * If the list is empty, throws an IllegalStateException to indicate
     * that there are no elements to remove.
     * </p>
     *
     * @return The removed element from the list.
     * @throws IllegalStateException if the list is empty.
     */
    public int remove() {
        if (this.size == 0) {
            throw new IllegalStateException("Cannot remove from an empty list.");
        }
        int removed = this.data[size - 1];
        this.size--;
        return removed;
    }

    /**
     * Retrieves the element at the specified index.
     * <p>
     * Returns the value at the given index if it is within valid bounds.
     * Throws an IndexOutOfBoundsException if the index is invalid.
     * </p>
     *
     * @param index The index of the element to retrieve.
     * @return The value stored at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size).
     */
    public int get(int index) {
        if (index >= 0 && index < this.size) {
            return this.data[index];
        }
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
    }

    /**
     * Returns the number of elements currently stored in the list.
     * <p>
     * The returned value represents the actual number of elements, not the capacity of the array.
     * </p>
     *
     * @return The number of elements in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Updates the value at a specified index.
     * <p>
     * Replaces the element at the given index with the provided value if the index is valid.
     * Throws an IndexOutOfBoundsException if the index is out of the list's current range.
     * </p>
     *
     * @param index The index where the new value should be set.
     * @param value The new value to store at the specified index.
     * @return The value that was set.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size).
     */
    public int set(int index, int value) {
        if (index >= 0 && index < this.size) {
            this.data[index] = value;
            return value;
        }
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
    }

    /**
     * Returns a string representation of the CustomArrayList object.
     * <p>
     * Displays the entire underlying array (including unused slots) and the current size.
     * This is useful for debugging to see both the elements and the capacity.
     * </p>
     *
     * @return A string showing the internal array and the current size.
     */
    @Override
    public String toString() {
        return "CustomArrayList { " +
                "data = " + Arrays.toString(this.data) +
                ", size = " + this.size +
                " }";
    }


    /**
     * Checks whether the list is full.
     * <p>
     * The list is considered full if the number of stored elements ('size')
     * equals the length of the underlying array.
     * </p>
     *
     * @return true if the list is full; false otherwise.
     */
    private boolean isFull() {
        return this.size == this.data.length;
    }

    /**
     * Resizes the internal data array by doubling its current capacity.
     * <p>
     * This method creates a new array with double the capacity of the current one,
     * copies all existing elements into it, and returns the new array.
     * <br><br>
     * Note: It is important not to modify the 'size' variable here because 'size' represents
     * the number of elements that have been added to the list, not the capacity of the array.
     * </p>
     *
     * @return The newly resized array.
     */
    private int[] reSizeArrayList() {
        // Create a new array with twice the capacity of the current data array.
        int[] newData = new int[data.length * 2];

        // Copy each element from the old array into the new array.
        for (int i = 0; i < data.length; i++) {
            newData[i] = this.data[i];
        }

        return newData;
    }

    /**
     * Displays all the elements in the list.
     * <p>
     * Iterates from index 0 to (size - 1) and prints each element stored in the list.
     * </p>
     */
    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.data[i]);
        }
    }

    /**
     * The main method to test the CustomArrayList functionality.
     * <p>
     * It adds multiple elements to the list (triggering a resize when necessary) and then
     * displays all the elements stored in the list.
     * </p>
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a new instance of CustomArrayList.
        CustomArrayList customArrayList = new CustomArrayList();

        // Add more elements than the initial capacity to test automatic resizing.
        for (int i = 0; i < 8; i++) {
            customArrayList.add(12);
        }

        System.out.println(customArrayList.toString());

    }
}
