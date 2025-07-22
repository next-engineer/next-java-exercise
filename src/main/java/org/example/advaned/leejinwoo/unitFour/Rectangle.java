package org.example.advaned.leejinwoo.unitFour;

public class Rectangle extends Shape{

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    int getArea() {
        return width * height;
    }
}
