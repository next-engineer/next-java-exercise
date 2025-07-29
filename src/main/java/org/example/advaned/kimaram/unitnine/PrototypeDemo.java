package org.example.advaned.kimaram.unitnine;

public class PrototypeDemo {
    public static void main(String[] args) {
        // 원본 객체
        Circle circle1 = new Circle(10);
        circle1.setColor("Red");

        // 복제 객체
        Circle circle2 = (Circle) circle1.clone();
        circle2.setColor("Blue");

        circle1.draw();     // Drawing Circle with radius 10 and color Red
        circle2.draw();     // Drawing Circle with radius 10 and color Blue

        // 또 다른 에시 : Rectangle
        Rectangle rectangle1 = new Rectangle(5, 7);
        rectangle1.setColor("Green");

        // 복제 객체
        Rectangle rectangle2 = (Rectangle) rectangle1.clone();

        // 수정해도 원본에는 영향 없음
        rectangle2.setWidth(10);
        rectangle2.setHeight(15);

        rectangle1.draw();      // Drawing Rectangle 5x7 with color Green
        rectangle2.draw();      // Drawing Rectangle 10x15 with color Green
    }
}
