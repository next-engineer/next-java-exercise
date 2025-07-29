package org.example.advaned.leehyemin.unitnine;

public class PrototypeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.setColor("Red");

        Circle copyCircle = (Circle) circle.clone();
        copyCircle.setColor("Blue");
        copyCircle.setRadius(8);

        circle.draw();
        copyCircle.draw();

        Rectangle rect = new Rectangle(10,7);
        rect.setColor("Green");

        Rectangle copyRect = (Rectangle) rect.clone();
        copyRect.setWidth(4);
        copyRect.setColor("Black");

        rect.draw();
        copyRect.draw();
    }
}
