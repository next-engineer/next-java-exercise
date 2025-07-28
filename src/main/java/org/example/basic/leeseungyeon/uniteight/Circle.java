package org.example.basic.leeseungyeon.uniteight;

public class Circle extends Shape {
    private double radius;

    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    // area() 메서드 구현 (원의 면적)
    @Override
    double area() {
        return Math.PI * radius * radius;  // 원의 면적 = π * r^2
    }


}
