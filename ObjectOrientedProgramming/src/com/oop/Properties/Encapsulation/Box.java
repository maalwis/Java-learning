package com.oop.Properties.Encapsulation;

public class Box {
    private double length; // Encapsulated field
    private double width;
    private double height;

    public Box(double l, double w, double h) {
        setLength(l); // Controlled initialization
        setWidth(w);
        setHeight(h);
    }

    public void setLength(double l) {
        if (l > 0) length = l; // Validation
        else throw new IllegalArgumentException("Length must be positive");
    }

    public double getLength() {
        return length; // Controlled access
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}