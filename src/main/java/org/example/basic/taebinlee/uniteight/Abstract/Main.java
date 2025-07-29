package org.example.basic.taebinlee.uniteight.Abstract;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10,20);
        Shape circle = new Circle(4);

        System.out.print("Rectanle :" + rectangle.area());
        System.out.print("Circle :" + circle.area());
    }
}
