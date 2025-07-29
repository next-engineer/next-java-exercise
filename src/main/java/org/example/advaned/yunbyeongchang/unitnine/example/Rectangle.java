package org.example.advaned.yunbyeongchang.unitnine.example;

public class Rectangle extends Shape{
    //var
    private int width;
    private int height;

    //method
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing " + width + " x " + height + " Rectangle with " + getColor() + " color.");
    }

    public int getWidth() { return this.width; }
    public int getHeight() { return this.height; }

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

}
