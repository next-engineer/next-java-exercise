package org.example.basic.kimaram.uniteight.shape;

public class Circle extends Shape{
    private final double radius; // 반지름

    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    // area() 구현
    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
