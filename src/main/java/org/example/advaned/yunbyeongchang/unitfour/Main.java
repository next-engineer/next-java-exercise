package org.example.advaned.yunbyeongchang.unitfour;

import java.util.ArrayList;

public class Main {
    //method
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();
        Square square = new Square();

        rect.setWidth(5);
        rect.setHeight(10);

        square.setWidth(5);

        Shape[] shapes = {rect, square};

        for (Shape shape : shapes)
            System.out.println("넓이: " + shape.getArea());

    }
}
