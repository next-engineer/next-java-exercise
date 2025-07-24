package org.example.advaned.leehyemin.unitfive;

<<<<<<< HEAD
import javax.smartcardio.Card;
import java.awt.*;

=======
>>>>>>> 5a75d72b88570db18af6ff9329710c6db5ba3097
public class Main {
    public static void main(String[] args) {
        Payment card=new CardPayment();
        Payment bank=new BankTransfer();
        Payment point=new PointPayment();

<<<<<<< HEAD
        OrderService order=new OrderService(card);
        order.checkout(10000);

        OrderService order1=new OrderService(bank);
        order1.checkout(116000);

        OrderService order2=new OrderService(point);
        order2.checkout(52000);
=======
        OrderService order_card=new OrderService(card);
        order_card.checkout(10000);

        OrderService order_bank=new OrderService(bank);
        order_bank.checkout(116000);

        OrderService order_point=new OrderService(point);
        order_point.checkout(52000);
>>>>>>> 5a75d72b88570db18af6ff9329710c6db5ba3097

    }
}
