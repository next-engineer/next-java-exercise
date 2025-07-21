package org.example.advaned.yunbyeongchang.unitfive.homework;

import java.awt.*;

public class Main {
    //var

    //method
    public static void main(String[] args){
        OrderService cardOrderService = new OrderService(new CardPayment());
        OrderService bankOrderService = new OrderService(new BankTransfer());
        OrderService pointOrderService = new OrderService(new PointPayment());

        cardOrderService.checkout(1000);
        bankOrderService.checkout(3000);
        pointOrderService.checkout(500);
    }
}
