package org.example.advaned.gojunho.unitfour;

public class Rectangle extends Shape {


    public void setWidth(int width){
        super.setWidth(width);

    }



    public void setHeight(int height){
        super.setHeight(height);


    }

    public void getArea(){
        System.out.println("직사각형의 넓이는"+(super.getWidth()*super.getHeight()));
    }
}
