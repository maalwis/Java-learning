package com.oop.functions;

/**
 * Demonstrates Java's pass-by-value behavior with custom objects.
 * Unlike Strings, custom objects are typically mutable, allowing their state to be modified
 * within a method, affecting the original object. However, reassigning a parameter to a new object
 * does not change the original reference, similar to Strings.
 *
 *
 */
public class PassByValueCustomObjects {

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        // ┌────────────────────────────────────────┐
        // │ Stack frame “main” is created:        │
        // │ - locals: person01_ref, person02_ref  │
        // │ - args: String[] args                 │
        // └────────────────────────────────────────┘

        // ┌──────────────────────────────────────────┐
        // │ Heap: new Person("kamal") → Object A    │
        // │      └─ field name = "kamal"            │
        // │ Heap: new Person("Nalani") → Object B   │
        // │      └─ field name = "Nalani"           │
        // └──────────────────────────────────────────┘
        Person person01 = new Person("kamal");
        Person person02 = new Person("Nalani");

        // ┌──────────────────────────────────────────┐
        // │ Stack “main”: person01_ref → Object A   │
        // │                person02_ref → Object B  │
        // └──────────────────────────────────────────┘
        System.out.println(person01 + ", " + person02);
        // Prints: kamal, Nalani

        System.out.println("person2 hash code: "
                + System.identityHashCode(person02));

        // ┌────────────────────────────────────────────────────────────┐
        // │ Calling greetings(person01_ref, person02_ref)             │
        // │   → pushes new “greetings” stack frame with:              │
        // │     - params: person01_param, person02_param             │
        // │   → copies of the references are passed (pass-by-value):│
        // │     person01_param = person01_ref                        │
        // │     person02_param = person02_ref                        │
        // └────────────────────────────────────────────────────────────┘
        greetings(person01, person02);

        System.out.println("person2 hash code: "
                + System.identityHashCode(person02));

        // ┌──────────────────────────────────────────┐
        // │ Back in “main” stack:                   │
        // │ person01_ref → Object A (now renamed)   │
        // │ person02_ref → Object B (now renamed)   │
        // └──────────────────────────────────────────┘
        System.out.println(person01 + ", " + person02);
        // Prints: hello kamal, hello Nalani
    }

    /**
     * Appends "hello " to each person’s name.
     *
     * <p>Because String is immutable, each concatenation:
     * <pre>
     *    "hello " + originalName
     * </pre>
     * actually builds a new String via StringBuilder under the hood, then
     * reassigns the Person’s name field to that new String.</p>
     *
     * @param person01 the first person whose name will be updated
     * @param person02 the second person whose name will be updated
     */
    private static void greetings(Person person01, Person person02) {
        // ┌──────────────────────────────────────────┐
        // │ Stack frame “greetings”:               │
        // │ - person01 (param) → Object A          │
        // │ - person02 (param) → Object B          │
        // └──────────────────────────────────────────┘

        //
        // 1) References are passed by value:
        //    - The “address” (reference) to each Person is copied into the new
        //      local parameters. Both point at the same heap objects A and B.
        //

        // ┌──────────────────────────────────────────┐
        // │ Heap Object A: field name = "kamal"     │
        // │ Heap Object B: field name = "Nalani"    │
        // └──────────────────────────────────────────┘

        // 1) Build a new String by prepending "hello " to the existing name.
        //    Internally, this is roughly compiled to:
        //      new StringBuilder()
        //          .append("hello ")
        //          .append(person01.getName())
        //          .toString();
        //    Result: a fresh String object, e.g. "hello kamal".

        // 2) Mutate the Person on the heap by updating its name reference.
        //    The original name String (if not used elsewhere) becomes
        //    eligible for garbage collection.

        // ┌──────────────────────────────────────────┐
        // │ Mutating the object:                    │
        // │ - Calls setter on Object A              │
        // │ - Heap Object A.name is changed to      │
        // │   "hello kamal"                         │
        // └──────────────────────────────────────────┘
        person01.setName("hello " + person01.getName());

        // 1) Build a new String by prepending "hello " to the existing name.
        //    Internally, this is roughly compiled to:
        //      new StringBuilder()
        //          .append("hello ")
        //          .append(person01.getName())
        //          .toString();
        //    Result: a fresh String object, e.g. "hello Nalani".

        // 2) Mutate the Person on the heap by updating its name reference.
        //    The original name String (if not used elsewhere) becomes
        //    eligible for garbage collection.

        // ┌──────────────────────────────────────────┐
        // │ Mutating the object:                    │
        // │ - Calls setter on Object B              │
        // │ - Heap Object B.name is changed to      │
        // │   "hello Nalani"                        │
        // └──────────────────────────────────────────┘
        person02.setName("hello " + person02.getName());


        //
        // 1) Mutating the object affects the caller’s view because both
        //    frames refer to the same heap objects.
        //      Demonstrate reassigning the local reference:
        //      This creates yet another Person object on the heap,
        //      but only the local variable (in this method) points to it.
        //      It does not change the caller’s person01 reference.

        // ┌──────────────────────────────────────────┐
        // │ Reassigning the parameter:              │
        // │ person01 = new Person("new person")     │
        // │ - Allocates Heap Object C with name     │
        // │   "new person"                          │
        // │ - Updates *local* person01 to point to  │
        // │   Object C                              │
        // └──────────────────────────────────────────┘
        person01 = new Person("new person");

        // ┌──────────────────────────────────────────┐
        // │ Now in “greetings” stack:               │
        // │ - person01 → Object C                   │
        // │ - person02 → Object B                   │
        // └──────────────────────────────────────────┘
        System.out.println(person01 + ", " + person02);
        // Prints: new person, hello Nalani

        // ┌──────────────────────────────────────────┐
        // │ Exiting greetings() pops its stack.     │
        // │ The local reassignment to person01 is   │
        // │ lost, but the heap mutations remain.    │
        // └──────────────────────────────────────────┘
    }
}