package org.example.advaned.yunbyeongchang.unitfive.homework;

import java.awt.*;

public class Main {
    //var

    //method
    public static void main(String[] args){
        OrderService cardOrderService = new OrderService(new CardPayment());
        OrderService bankOrderService = new OrderService(new BankTransfer());
        OrderService pointOrderService = new OrderService(new PointPayment());
        OrderService voucherOrderService = new OrderService(new VoucherPayment());

        cardOrderService.checkout(1000);
        bankOrderService.checkout(3000);
        pointOrderService.checkout(500);
        voucherOrderService.checkout(1000);

//        OrderService orderService = new OrderService(new CardPayment());
//        orderService.checkout(1000);
//
//        orderService.setOrderService(new BankTransfer());
//        orderService.checkout(3000);
//
//        orderService.setOrderService(new PointPayment());
//        orderService.checkout(500);
//
//        orderService.setOrderService(new VoucherPayment());
//        orderService.checkout(5000);
    }
}
