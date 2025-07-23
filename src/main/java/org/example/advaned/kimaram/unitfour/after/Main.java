package org.example.advaned.kimaram.unitfour.after;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // shape list 생성
        ArrayList<Shape> shapes = makeShapes();
        // 넓이 출력
        printArea(shapes);

    }
    // shape list 생성 메서드
    public static ArrayList<Shape> makeShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        // rectangle, square 업캐스팅
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        // shape 다운캐스팅
        ((Rectangle)rectangle).setWidth(5);
        ((Rectangle)rectangle).setHeight(10);
        shapes.add(rectangle);

        ((Square)square).setWidth(5);
        shapes.add(square);

        return shapes;
    }
    // 넓이 출력 메서드
    public static void printArea(ArrayList<Shape> shapes) {
        for (Shape item : shapes) {
            // instanceof : 객체 타입이 일치하면 true
            // 직사각형인지 정사각형인지 객체 타입을 확인해서 해당 객체에 대한 string 출력
            if (item instanceof Rectangle) {
                System.out.print("직사각형의 넓이 : ");
            } else if (item instanceof Square) {
                System.out.print("정사각형의 넓이 : ");
            }
            // 넓이 출력
            System.out.println(item.getArea());
        }
    }
}
