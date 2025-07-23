package org.example.basic.leehyemin.uniteight.paymentInterface;

public class KaKaoPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("카카오 페이 결제 : "+amount);
    }
}
