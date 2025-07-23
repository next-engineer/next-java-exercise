package org.example.basic.parkgwanghoon.UnitEight_1;

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
