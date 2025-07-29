package org.example.advaned.kimaram.unitnine;

// Shape 상속하여 clone() 메서드 구현
public class Circle extends Shape{
    private int radius;

    // 생성자
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius " + radius + " and color " + getColor());
    }

    // Getter
    public int getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
