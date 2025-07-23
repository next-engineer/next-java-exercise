package org.example.basic.kimyoungji.uniteight.practice.shape;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4, 5);
        Shape s2 = new Circle(3);

        System.out.println("Rectangle Area: " + s1.area());
        System.out.println("Circle Area: " + s2.area());
    }
}