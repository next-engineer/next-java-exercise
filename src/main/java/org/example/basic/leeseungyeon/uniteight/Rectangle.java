package org.example.basic.leeseungyeon.uniteight;

// Rectangle 클래스 (Shape를 상속)
class Rectangle extends Shape {
    private double width;
    private double height;

    // 생성자
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // area() 메서드 구현 (직사각형의 면적)
    @Override
    double area() {
        return width * height;
    }
}
