package com.oop.Introduction;

public class Main {
    public static void main(String[] args) {

        /**
         * Classes as Blueprints and Object Instantiation
         * In Java, a class like Student serves as a blueprint for creating objects: it defines the structure
         * (fields such as rollNum, name, marks) and behavior (methods like greeting()). When you declare
         * Student student1;, you’re only creating a reference variable; no object exists yet.
         * Only the new Student() call triggers instantiation: the JVM allocates memory on the heap,
         * invokes the constructor to initialize instance variables, and returns a reference to that object.
         */
        Student student1; // Reference to a Student object, not the object itself

        /**
         * To instantiate a Student object, use the `new` keyword. At runtime, `new Student()`:
         * 1. Allocates memory for the object on the heap.
         * 2. Invokes the Student class’s default constructor to initialize its fields.
         * 3. Returns a reference to the newly created object, which is then stored in the variable `student1`.
         * Note: In Java, a reference variable (such as `student1`) does not contain the object itself, but
         * rather a pointer to its memory location.
         */
        student1 = new Student();

        /**To access object instance variable, we use dot operator to access or modify an objects' instance variables.
         * This dot (.) operator connects the object reference variable "student1" to its instance variable (rollNum, name, marks).
         * */
        student1.rollNum = 12;
        student1.name = "john";
        student1.marks = 100;


        // or you can create an object of Student class in just one line.
        Student student2 = new Student();

        /**
         * Method Invocation and this Keyword
         * When you call student2.greeting(), Java dynamically looks up the greeting() method
         * on the Student class associated with this object, executes it, and prints "Hello my name is"
         * followed by the name field. Inside greeting(), name and this.name are equivalent;
         * this explicitly refers to the current instance.
         */
        student2.greeting();

        /**
         * Parameterized Constructor and Variable Shadowing
         * Here we pass values into the constructor. Inside that constructor,
         * using "this.rollNum = rollNum" disambiguate between the field and parameter,
         * preventing the common mistake name = name which would assign the parameter to itself.
         */
        Student student3 = new Student(12, "doe", 56.67f);
    }
}

/**
 * Definition of the Student class, encapsulating properties and behaviors of a student entity.
 */
class Student {
    int rollNum;
    String name;
    float marks;

    /**
     * 5. Default Constructor and Automatic Initialization
     * A no-argument constructor where Java auto-initializes primitives to default values:
     * int → 0, float → 0.0f, object references → null. You can omit this entirely and
     * Java will provide a default constructor, but declaring it makes intent explicit.
     */
    Student() {
        // No explicit initialization: rollNum=0, name=null, marks=0.0f
    }

    /**
     * Parameterized Constructor and Use of this()
     * Assigns parameter values to instance variables. "this" refers to the current instance.
     * and we can also represent this as:
     * this.name = name; is equal to student1.name = name;
     * This pattern resolves variable shadowing and clearly communicates intent.
     */
    Student(int rollNum, String name, float marks) {
        this.rollNum = rollNum;  // Assigns the parameter rollNum to this.rollNum
        this.name = name;     // Assigns the parameter name to this.name
        this.marks = marks;    // Assigns the parameter marks to this.marks

        // name = name; <------ this assigns parameter to itself.
    }

    /**
     * Behavior Method and Polymorphism Potential
     * The greeting() method demonstrates how an object can expose behavior based on its state.
     */
    void greeting() {
        System.out.println("Hello my name is " + name); // this.name
    }

   
}