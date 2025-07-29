package org.example.advaned.leehyemin.uniteight.pay;

public abstract class PaymentFactory {
    public void process(int amount) {
        Payment payment = createPayment();
        payment.pay(amount);
    }

    protected abstract Payment createPayment();
}
