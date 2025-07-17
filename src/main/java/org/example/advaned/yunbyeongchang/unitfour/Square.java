package org.example.advaned.yunbyeongchang.unitfour;

public class Square extends Rectangle{
    //var

    //method
    public Square()
    {
        this.width = 0;
        this.height = 0;
    }

    @Override
    public void setWidth(int width)     // 너비 변경
    {
        this.width = width;
        this.height = width;            // 동일하게 설정
    }

    @Override
    public void setHeight(int height)   // 높이 변경
    {
        this.height = height;
        this.width = height;            // 동일하게 설정
    }
}
