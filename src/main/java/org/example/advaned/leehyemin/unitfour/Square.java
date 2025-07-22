package org.example.advaned.leehyemin.unitfour;

//정사각형
public class Square extends Shape {
    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
//    @Override
//    public void setWidth(int width) {
//        super.setWidth(width);
//        super.setHeight(width);// 정사각형 유지
//    }
//
//    @Override
//    public void setHeight(int height) {
//        super.setHeight(height);
//        super.setWidth(height);
//    }


}
