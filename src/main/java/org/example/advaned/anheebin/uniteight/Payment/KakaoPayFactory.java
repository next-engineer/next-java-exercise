package org.example.advaned.anheebin.uniteight.Payment;

public class KakaoPayFactory extends PaymentFactory {
    protected Payment createPayment() {
        return new KakaoPay();
    }
}
