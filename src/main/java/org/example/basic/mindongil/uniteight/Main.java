package org.example.basic.mindongil.uniteight;

public class Main {

    public static void main(String[] args) {

        //넓이 구하기 추상 클래스 사용
        Shape ractangle = new Rectangle(4,5);
        Shape circle = new Circle(5);

        System.out.println("사각형의 넓이: " + ractangle.area());
        System.out.println("원의 넓이: " + circle.area());

        //계산 방식 인터페이스 사용
        Payment method;

        // 조건에 따라 다른 결제 방식 사용
        method = new CreditCardPayment();
        method.pay(5000);

        method = new KakaoPay();
        method.pay(7000);
    }

}
