package org.example.advaned.leejinwoo.unitFour;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Shape rectangle = new Rectangle(10,20);
        shapes.add(rectangle);

        Shape square = new Square(10);
        shapes.add(square);

        shapesPrintInfo(shapes);
    }

    public static void shapesPrintInfo(List<Shape> shapes){
        for(Shape list : shapes){
            System.out.println("Area : " + list.getArea());
        }
    }
}
