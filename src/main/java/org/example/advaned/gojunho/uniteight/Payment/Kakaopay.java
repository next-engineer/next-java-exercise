package org.example.advaned.gojunho.uniteight.Payment;

public class Kakaopay implements Payment{
    @Override
    public void pay(int amount) {
        double fee=500;
        System.out.println("카카오페이 결제 완료. 수수료: "+fee+"원");
    }
}
