package org.example.basic.mindongil.uniteight;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
