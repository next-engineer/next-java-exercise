package org.example.basic.yunbyeongchang.uniteight.homework.shape;

public class Circle extends Shape {
    //var
    private double radius;

    //method
    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double area()
    {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
