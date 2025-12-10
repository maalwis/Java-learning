package com.oop.Generics;

public class CustomMap<K, V> {
    // The 'keys' array is declared as K[], but due to type erasure, it’s created as Object[]
    // and cast to K[]. This is a common best practice for generic collections in Java to
    // support any key type while maintaining type safety at compile time.
    private K[] keys;
    // The 'values' array pairs with keys, using V[] for values, similarly cast from Object[].
    private V[] values;
    private int size = 0;

    // Constructor initializes both arrays with a capacity of 10. In a real map, you’d use
    // a hash table or handle resizing, but this keeps it simple. Best practice: initialize
    // with a reasonable size to optimize performance.
    public CustomMap() {
        keys = (K[]) new Object[10];
        values = (V[]) new Object[10];
    }

    // The 'put' method accepts a key of type K and a value of type V, ensuring that only
    // matching types are used. It checks for existing keys and overwrites their values,
    // or adds a new pair if the key is new. Best practice: use generics in method parameters
    // to enforce type consistency and avoid runtime type errors.
    public void put(K key, V value) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                values[i] = value; // Overwrites value if key exists
                return;
            }
        }
        keys[size] = key;
        values[size] = value;
        size++; // Increments size for new entries
    }

    // The 'get' method takes a key of type K and returns a value of type V. It searches
    // linearly (not optimal for large maps, but simple here) and returns null if the key
    // isn’t found. Best practice: use generics to ensure the return type matches the
    // declared value type, avoiding casts in client code.
    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null; // Returns null if key isn’t found; in practice, consider Optional<V>
    }

    public static void main(String[] args) {
        // Creates a map with K as String and V as Integer. Best practice: explicitly define
        // both type parameters for clarity and type safety.
        CustomMap<String, Integer> scores = new CustomMap<>();
        scores.put("Alice", 95);  // K is String, V is Integer
        scores.put("Bob", 87);

        // Retrieves a value using a String key, returning an Integer without casting.
        // Best practice: leverage generics for type-safe retrieval.
        Integer aliceScore = scores.get("Alice"); // Returns 95
        System.out.println(aliceScore);

        // Creates a map with K as Integer and V as String, showing flexibility of generics.
        // Best practice: use generics to adapt the class to different key-value types.
        CustomMap<Integer, String> idToName = new CustomMap<>();
        idToName.put(1, "Alice"); // K is Integer
        // idToName.put("2", "Bob"); // Compile-time error if uncommented, as "2" isn’t an Integer
    }
}