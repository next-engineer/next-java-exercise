package org.example.advaned.leejinwoo.unitSix;

public class PaymentMain {
    public static void main(String[] args) {
        Payment card = new CardPayment();
        Payment point = new PointPayment();

        OrderService order1 = new OrderService(card);
        order1.checkout(10000); //카드결제

        OrderService order2 = new OrderService(point);
        order2.checkout(5000);  //포인트 결제

    }
}
