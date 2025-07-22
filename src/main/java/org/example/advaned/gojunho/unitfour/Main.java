package org.example.advaned.gojunho.unitfour;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]){
        Shape shape1= new Rectangle();
        Shape shape2= new Square();
        List<Shape> shapeList= Arrays.asList(shape1,shape2);
        for(Shape shapelist : shapeList){
            shapelist.setHeight(10);
            shapelist.setWidth(5);
            shapelist.getArea();
        }

    }


}
