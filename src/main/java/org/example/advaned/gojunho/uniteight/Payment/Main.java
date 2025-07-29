package org.example.advaned.gojunho.uniteight.Payment;

public class Main {
    public static void main(String[] args){
        PaymentFactory factory1=new CardPaymentFactory();
        factory1.process(10000);
        PaymentFactory factory2=new KakaoPayFactory();
        factory2.process(10000);
    }
}
