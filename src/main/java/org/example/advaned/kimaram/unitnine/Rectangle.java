package org.example.advaned.kimaram.unitnine;

public class Rectangle extends Shape {
    private int width;
    private int height;

    // 생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle " + width + "x" + height + " with color " + getColor());
    }

    // Getter
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Setter
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
