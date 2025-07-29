package org.example.advaned.leejinwoo.unitFour;

public abstract class Shape {
    int width;
    int height;
    int length;

    public Shape(
            int width,
            int height
    ){
        this.width = width;
        this.height = height;
    }

    public Shape(int length){
        this.length = length;
    }

    void setWidth(int width){
        this.width = width;
    }
    void setHeight(int height){
        this.height = height;
    }

    abstract int getArea();
}
