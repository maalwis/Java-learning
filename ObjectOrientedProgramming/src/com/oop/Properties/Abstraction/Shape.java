package com.oop.Properties.Abstraction;

abstract class Shape {
    abstract void draw(); // Abstract method
    void info() { System.out.println("A shape"); } // Concrete method
}

class Circle extends Shape {
    @Override
    void draw() { System.out.println("Drawing a circle"); }
}

interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    @Override
    public void draw() { System.out.println("Drawing a rectangle"); }
}