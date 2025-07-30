package org.example.basic.leejinwoo.unitEight.Shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return (radius * radius) * 3.14;
    }
}
