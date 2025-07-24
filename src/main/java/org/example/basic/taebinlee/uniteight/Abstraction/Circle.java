package org.example.basic.taebinlee.uniteight.Abstraction;

class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;   // 원주율 * 반지름 제곱
    }
}
