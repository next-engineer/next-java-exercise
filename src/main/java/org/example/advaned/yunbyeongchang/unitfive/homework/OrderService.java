package org.example.advaned.yunbyeongchang.unitfive.homework;

public class OrderService {
    //var
    private final Payment payment;

    //method
    public OrderService(Payment payment)
    {
        this.payment = payment;
    }

    public void checkout(int amount) {
        payment.pay(amount);
    }
}
