package org.example.advaned.leehyemin.uniteight.pay;

public class KakaoPayFactory extends PaymentFactory {

    @Override
    protected Payment createPayment() {
        return new KakaoPay();
    }
}
