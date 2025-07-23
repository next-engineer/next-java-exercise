package org.example.advaned.gojunho.unitfour;

public class Square extends Shape {



    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }


    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);

    }

    public void getArea(){
        System.out.println("정사각형의 넓이는"+(super.getWidth()*super.getHeight()));
    }
}
