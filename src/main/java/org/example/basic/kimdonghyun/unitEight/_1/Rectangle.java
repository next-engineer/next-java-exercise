package org.example.basic.kimdonghyun.unitEight._1;

public class Rectangle extends Shape{
    private double width;
    private double height;

    // 생성자
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 면적 계산
    @Override
    double area() {
        return width * height;
    }
}
