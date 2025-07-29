package org.example.advaned.kimaram.unitfive;

public class OrderService {
    private final Payment payment;

    // 생성자
    public OrderService(Payment payment) {
        this.payment = payment;
    }

    public void checkout(int amount) {
        payment.pay(amount);
    }
}
