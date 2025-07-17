package org.example.advaned.kimaram.unitfour.before;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Square();
        rect.setWidth(5);
        rect.setHeight(10);

        System.out.println(rect.getArea());
    }
}
