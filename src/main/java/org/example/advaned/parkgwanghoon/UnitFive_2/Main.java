package org.example.advaned.parkgwanghoon.UnitFive_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 10));
        shapes.add(new Square(7));
        shapes.add(new Rectangle(2, 3));

        for (Shape shape : shapes) {
            System.out.println("넓이: " + shape.getArea());
        }
    }
}