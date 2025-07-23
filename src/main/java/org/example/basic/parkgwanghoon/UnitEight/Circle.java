package org.example.basic.parkgwanghoon.UnitEight;

class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return radius * radius * Math.PI;
    }
}
