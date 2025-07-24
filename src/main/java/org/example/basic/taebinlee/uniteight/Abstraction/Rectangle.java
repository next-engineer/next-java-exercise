package org.example.basic.taebinlee.uniteight.Abstraction;

class Rectangle extends Shape {
    private double width;
    private double height;

    // 생성자 및 area() 구현
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}
