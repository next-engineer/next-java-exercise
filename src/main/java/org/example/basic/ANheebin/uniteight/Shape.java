package org.example.basic.ANheebin.uniteight;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    // 생성자 및 area() 구현
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    // 생성자 및 area() 구현
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}



