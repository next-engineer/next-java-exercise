package org.example.advaned.gojunho.unitfour;

public abstract class Shape {
    private int width;
    private int height;

    public abstract void getArea();

    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}
