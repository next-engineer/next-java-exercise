package org.example.advaned.leehyemin.unitfive;

public class PointPayment implements Payment {
    @Override
    public void pay(int mount) {
        System.out.println("포인트로 "+mount+"원 결제합니다.");
    }
}
