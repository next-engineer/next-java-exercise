package org.example.advaned.yunbyeongchang.unitnine.example;

public class Circle extends Shape {
    //var
    private int radius;

    //method
    public Circle(int radius)   { this.radius = radius; }

    @Override
    public void draw()
    {
        System.out.println("Drawing Circle with " + radius + " radius and " + getColor() + " color.");
    }

    public int getRadius() { return this.radius; }
    public void setRadius(int radius) { this.radius = radius; }

}
