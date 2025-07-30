package org.example.basic.bangjihyun.uniteight;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4, 5);  // 면적: 20
        Shape s2 = new Circle(3);        // 면적: 약 28.27

        System.out.printf("Rectangle Area: %.2f%n", s1.area());
        System.out.printf("Circle Area: %.2f%n", s2.area());
    }
}
