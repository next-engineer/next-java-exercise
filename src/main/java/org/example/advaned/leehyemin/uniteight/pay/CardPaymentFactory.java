package org.example.advaned.leehyemin.uniteight.pay;

public class CardPaymentFactory extends PaymentFactory {
    @Override
    protected Payment createPayment() {
        return new CardPayment();
    }
}
