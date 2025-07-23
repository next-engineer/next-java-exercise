package org.example.advaned.sangyoonlee.unitfive;

public class PointPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("포인트로 " + amount + "원 결제합니다.");
    }
}
