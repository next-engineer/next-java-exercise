package org.example.basic.leejinwoo.unitEight.Shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(5);

        System.out.println("rectangle : " + rectangle.area());
        System.out.println("circle : " + circle.area());
    }
}
