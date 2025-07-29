package org.example.advaned.gojunho.uniteight.Payment;

public abstract class PaymentFactory {
    public void process(int amount){
        Payment payment = createPayment();

        payment.pay(amount);
    }

    protected abstract Payment createPayment();
}
