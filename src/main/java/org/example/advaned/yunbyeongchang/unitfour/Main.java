package org.example.advaned.yunbyeongchang.unitfour;

public class Main {
    //method
    public static void main(String[] args)
    {
        Rectangle rect = new Square();
        rect.setHeight(5);
        rect.setHeight(10);

        System.out.println("예상 넓이: 5 * 10 == 50");
        System.out.println("rect의 넓이: " + rect.getArea());
    }
}
