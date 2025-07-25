package org.example.advaned.kimyoungji.uniteight.exercise;

public class KakaoPayFactory extends PaymentFactory {
    protected Payment createPayment() {
        return new KakaoPay();
    }
}

