package org.example.advaned.gojunho.uniteight.Payment;

public class KakaoPayFactory extends PaymentFactory{
    @Override
    protected Payment createPayment() {
        return new Kakaopay();
    }
}
