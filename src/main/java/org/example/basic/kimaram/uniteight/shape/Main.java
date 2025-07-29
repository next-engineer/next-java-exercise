package org.example.basic.kimaram.uniteight.shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4,5); // 면적: 20
        Shape circle = new Circle(3); // 면적 : 28.27..

        System.out.println(rectangle.area());
        System.out.println(circle.area());
    }
}
