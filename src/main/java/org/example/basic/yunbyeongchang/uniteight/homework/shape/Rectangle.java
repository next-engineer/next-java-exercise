package org.example.basic.yunbyeongchang.uniteight.homework.shape;

public class Rectangle extends Shape{
    //var
    private double width;
    private double height;

    //method
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area()
    {
        return this.width * this.height;
    }
}
