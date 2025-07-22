package org.example.advaned.kimyoungji.unitfive;

public class OrderService {
    private final Payment payment;

    public OrderService(Payment payment) {
        this.payment = payment;
    }

    public void checkout(int amount) {
        payment.pay(amount);
    }
}