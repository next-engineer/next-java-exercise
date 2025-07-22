package org.example.advaned.kimyoungji.unitfour.asis;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Square();  // 다형성
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println("면적: " + rect.getArea());  // 기대값: 5 * 10 = 50? 실제는?
    }
}
