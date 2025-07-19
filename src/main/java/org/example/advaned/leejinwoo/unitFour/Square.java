package org.example.advaned.leejinwoo.unitFour;

public class Square extends Shape{
    private int length;

    public Square(int length) {
        super(length);
    }

    @Override
    int getArea() {
        return super.length * super.length;
    }
}
