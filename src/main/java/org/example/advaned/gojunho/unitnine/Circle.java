package org.example.advaned.gojunho.unitnine;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius "+radius+
                " and color "+getColor());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
