package org.example.advaned.yunbyeongchang.uniteight.example;

public class KakaoPayFactory extends PaymentFactory{
    //var

    //method

    @Override
    protected Payment createPayment() {
        return new KakaoPay();
    }
}
