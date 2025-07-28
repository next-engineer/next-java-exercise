package org.example.basic.leeseungyeon.uniteight;

public class Main {
    public static void main(String[] args) {
        // 다형성 활용
        Shape s1 = new Rectangle(4, 5);  // 직사각형의 면적: 20
        Shape s2 = new Circle(3);        // 원의 면적: 28.27...

        System.out.println("Rectangle 면적: " + s1.area());
        System.out.println("Circle 면적: " + s2.area());
    }
}
