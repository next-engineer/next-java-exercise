package org.example.advaned.leehyemin.unitfive;

import javax.smartcardio.Card;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Payment card=new CardPayment();
        Payment bank=new BankTransfer();
        Payment point=new PointPayment();

        OrderService order=new OrderService(card);
        order.checkout(10000);

        OrderService order1=new OrderService(bank);
        order1.checkout(116000);

        OrderService order2=new OrderService(point);
        order2.checkout(52000);

    }
}
