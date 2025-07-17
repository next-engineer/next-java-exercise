package org.example.advaned.parkgwanghoon.UnitFive_1;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
