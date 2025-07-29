package org.example.advaned.yunbyeongchang.unitnine.example;

public abstract class Shape implements Cloneable {
    //var
    private String color;

    //method
    public void setColor(String color) { this.color = color; }
    public String getColor()    { return color; }

    public abstract void draw();

    @Override
    public Shape clone()
    {
        try
        {
            return (Shape) super.clone();   // 얕은 복사
        } catch(CloneNotSupportedException e)
        {
            throw new RuntimeException("Clone not supported", e);
        }
    }

}
