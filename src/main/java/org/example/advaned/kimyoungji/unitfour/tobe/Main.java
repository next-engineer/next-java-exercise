package org.example.advaned.kimyoungji.unitfour.tobe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Square(5));
        shapes.add(new Rectangle(3, 3));
        shapes.add(new Square(10));

        for (Shape s : shapes) {
            System.out.println("면적: " + s.getArea());
        }
    }
}