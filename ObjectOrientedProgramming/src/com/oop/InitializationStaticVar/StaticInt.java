package com.oop.InitializationStaticVar;

/**
 * The `StaticInt` class demonstrates static variables and static initialization blocks. Static variables `a` and `b` are associated with the class rather than instances, and the static block executes only once when the class is loaded into memory, initializing `b` based on `a`. The `main` method shows how these static variables retain their values across object creations and can be modified, with changes reflected universally due to their class-level scope.
 */
public class StaticInt {
    public static int a = 4;
    public static int b;

    static {
        System.out.println("this is a static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInt obj00 = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);

        StaticInt.b += 3;
        System.out.println(StaticInt.a + " " + StaticInt.b);

        StaticInt obj01 = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);
    }
}