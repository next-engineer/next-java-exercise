package org.example.advaned.yunbyeongchang.unitfour;

public class Rectangle extends Shape{
    //var
    protected int width;
    protected int height;

    //method
    public Rectangle()
    {
        this.width = 0;
        this.height = 0;
    }

    public void setWidth(int width)         // 너비 변경
    {
        this.width = width;
    }

    public void setHeight(int height)       // 높이 변경
    {
        this.height = height;
    }

    @Override
    public int getArea()                    // 넓이 출력
    {
        return this.width * this.height;
    }
}
