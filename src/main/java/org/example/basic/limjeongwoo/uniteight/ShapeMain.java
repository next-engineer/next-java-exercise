package org.example.basic.limjeongwoo.uniteight;

public class ShapeMain {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4, 5);
        Shape s2 = new Circle(3);

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
