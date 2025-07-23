package org.example.advaned.leehyemin.unitfour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle=new Square();
//        rectangle.setWidth(5);
//        rectangle.setHeight(10);
//
//        System.out.println("넓이 : "+rectangle.getArea());

        List<Shape> shapes = new ArrayList<>(Arrays.asList(
                new Rectangle(5, 6),
                new Rectangle(7, 9),
                new Rectangle(4, 3),
                new Square(4, 4),
                new Square(6, 6),
                new Square(8, 8)
        ));

        for (Shape shape : shapes) {
            System.out.println("넓이 : "+shape.getArea());
        }
    }
}
