package org.example.advaned.kimaram.unitfive;

public class Main {
    public static void main(String[] args) {
        Payment card = new CardPayment();
        Payment point = new PointPayment();
        Payment bank = new BankTransfer();

        OrderService order1 = new OrderService(card);
        order1.checkout(10000);

        OrderService order2 = new OrderService(point);
        order2.checkout(5000);

        OrderService order3 = new OrderService(bank);
        order3.checkout(300000);
    }
}
