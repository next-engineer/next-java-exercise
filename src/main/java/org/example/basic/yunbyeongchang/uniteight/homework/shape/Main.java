package org.example.basic.yunbyeongchang.uniteight.homework.shape;

public class Main {
    //var

    //method
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4, 5);  // 면적: 20
        Shape s2 = new Circle(3);       // 면적: 28.27...

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
