package com.oop.Generics;

public class CustomList<E> {
    // The 'elements' array uses Object[] because generics in Java are implemented via type erasure,
    // meaning type information (E) is not available at runtime. This is a best practice for
    // storing generic elements internally while allowing flexibility for any type.
    private Object[] elements;
    private int size = 0;

    // Constructor initializes the array with a default capacity of 10. In a production-ready
    // implementation, you'd include resizing logic to handle dynamic growth, but it's kept
    // simple here for clarity. Best practice: always initialize collections with a reasonable
    // default size to avoid immediate resizing.
    public CustomList() {
        elements = new Object[10];
    }

    // The 'add' method accepts an element of type E, ensuring type safety at compile time.
    // Only objects of the type specified when instantiating CustomList<E> can be added.
    // Best practice: use the generic type parameter in method signatures to enforce type
    // constraints and avoid runtime errors.
    public void add(E element) {
        if (size == elements.length) {
            // Resizing logic would go here (e.g., doubling the array size), but it's omitted
            // for simplicity. Best practice: implement dynamic resizing in real-world collections.
        }
        elements[size++] = element;
    }

    // The 'get' method returns an element of type E at the specified index. The cast to (E)
    // is required due to type erasure (Object[] at runtime), but it’s safe because the
    // compiler ensures only type E elements are added. Best practice: use generics to
    // eliminate the need for explicit casting in client code, improving readability.
    public E get(int index) {
        if (index >= size || index < 0) {
            // Throws an exception for invalid indices, adhering to Java’s best practice of
            // fail-fast behavior to catch errors early.
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return (E) elements[index];
    }


    public static void main(String[] args) {
        // Instantiates a CustomList with E as Integer. The diamond operator (<>) infers the
        // type from the declaration, a best practice since Java 7 for cleaner code.
        CustomList<Integer> numbers = new CustomList<>();
        numbers.add(42);  // Only Integers can be added; type safety is enforced at compile time.
        numbers.add(100);

        // Retrieves the element at index 0 as an Integer without casting, thanks to generics.
        // Best practice: specify the type parameter to avoid raw types and ensure type safety.
        Integer number = numbers.get(0); // Returns 42
        System.out.println(number);

        // Instantiates a CustomList with E as String, showing how generics allow reuse with
        // different types. Best practice: use meaningful type parameters for flexibility.
        CustomList<String> names = new CustomList<>();
        names.add("Alice"); // Only Strings are allowed
        // names.add(42); // Uncommenting this causes a compile-time error, demonstrating
        // type safety enforced by generics.
    }
}