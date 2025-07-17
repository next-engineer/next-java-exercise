package org.example.advaned.kimaram.unitfour.after;

public class Square extends Shape{
    private int width;
    private int height;

    @Override
    public int getArea() {
        return width * height;
    }

    // setter
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }
}
