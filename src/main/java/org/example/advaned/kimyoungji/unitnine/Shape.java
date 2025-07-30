package org.example.advaned.kimyoungji.unitnine;

public abstract class Shape implements Cloneable {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();  // 얕은 복사
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }
}
