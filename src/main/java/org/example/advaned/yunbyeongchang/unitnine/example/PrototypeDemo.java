package org.example.advaned.yunbyeongchang.unitnine.example;

public class PrototypeDemo {
    //var

    //method
    public static void main(String[] args)
    {
        //원본 객체
        Circle originCircle = new Circle(10);
        originCircle.setColor("Red");

        //복제 객체
        Circle duplicatedCircle = (Circle) originCircle.clone();
        duplicatedCircle.setColor("Blue");

        originCircle.draw(); duplicatedCircle.draw();

        //원본 객체
        Rectangle originRectangle = new Rectangle(5, 10);
        originRectangle.setColor("Black");

        //복제 객체
        Rectangle duplicatedRectangle = (Rectangle) originRectangle.clone();
        duplicatedRectangle.setColor("White");
        duplicatedRectangle.setHeight(20);          //originRectangle의 height에는 영향이 가지 않는다.(clone이 완료된 이후 변경된 객체에서 변경하기 때문)


        originRectangle.draw(); duplicatedRectangle.draw();
    }
}
