package org.example.advaned.kimyoungji.unitfour.asis;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;  // 항상 정사각형이 되도록
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;  // 항상 정사각형이 되도록
    }
}