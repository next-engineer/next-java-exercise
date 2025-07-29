package org.example.advaned.kimyoungji.unitnine;

public class PrototypeDemo {
    public static void main(String[] args) {
        // 원본 객체
        Circle circle1 = new Circle(10);
        circle1.setColor("Red");

        // 복제 객체
        Circle circle2 = (Circle) circle1.clone();
        circle2.setColor("Blue");

        circle1.draw();  // Drawing Circle with radius 10 and color Red
        circle2.draw();  // Drawing Circle with radius 10 and color Blue

        // 또 다른 예시: Rectangle
        Rectangle rect1 = new Rectangle(5, 7);
        rect1.setColor("Green");

        Rectangle rect2 = (Rectangle) rect1.clone();
        rect2.setWidth(10);  // 수정해도 원본에는 영향 없음

        rect1.draw();  // Drawing Rectangle 5x7 with color Green
        rect2.draw();  // Drawing Rectangle 10x7 with color Green
    }
}
