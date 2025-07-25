package org.example.advaned.gojunho.unitnine;

public class PrototypeDemo {
    public static void main(String[] args){
        Circle circle1 = new Circle(10);
        circle1.setColor("Red");

        Circle circle2 = (Circle) circle1.clone();
        circle2.setColor("Blue");

        circle1.draw();
        circle2.draw();

        Rectangle rect1 = new Rectangle(5,7);
        rect1.setColor("Green");

        Rectangle rect2= (Rectangle) rect1.clone();
        rect2.setWidth(10);

        rect1.draw();
        rect2.draw();
    }
}
