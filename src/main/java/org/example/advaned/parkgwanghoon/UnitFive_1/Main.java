package org.example.advaned.parkgwanghoon.UnitFive_1;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Square();  // 다형성
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println("넓이: " + rect.getArea());  // 출력 결과는 100
    }
}