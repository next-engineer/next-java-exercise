package org.example.advaned.kimaram.unitfour.before;

public class Rectangle extends Shape{
    private int width;
    private int height;

    @Override
    public int getArea() {
        return width * height;
    }

    // setter
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
