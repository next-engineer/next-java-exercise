package org.example.advaned.leehyemin.unitfive;

public class CardPayment implements Payment {
    @Override
    public void pay(int mount) {
        System.out.println("카드로 "+mount+"원 결제합니다.");
    }
}
