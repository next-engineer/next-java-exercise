package org.example.advaned.yunbyeongchang.unitfour;

public class Square extends Shape{
    //var
    private int width;
    //method
    public Square()
    {
        this.width = 0;
    }

    public void setWidth(int width)     // 너비 변경
    {
        this.width = width;
    }

    public void setHeight(int width)   // 높이 변경(사실 정사각형이므로 하나로 통일해도 됨)
    {
        this.width = width;
    }

    @Override
    public int getArea()
    {
        return width * width;
    }
}
