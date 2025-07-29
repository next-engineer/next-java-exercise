package org.example.basic.kimaram.uniteight.shape;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    // 생성자 구현
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // area() 구현
    @Override
    double area() {
        return width * height;
    }
}
