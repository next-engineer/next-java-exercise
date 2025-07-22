package org.example.advaned.leehyemin.unitfive;

public class Main {
    public static void main(String[] args) {
        Payment card=new CardPayment();
        Payment bank=new BankTransfer();
        Payment point=new PointPayment();

        OrderService order_card=new OrderService(card);
        order_card.checkout(10000);

        OrderService order_bank=new OrderService(bank);
        order_bank.checkout(116000);

        OrderService order_point=new OrderService(point);
        order_point.checkout(52000);

    }
}
