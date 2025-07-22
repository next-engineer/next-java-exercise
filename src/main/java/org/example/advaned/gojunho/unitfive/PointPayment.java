package org.example.advaned.gojunho.unitfive;

public class PointPayment implements Payment{
    public void pay(int amount){
        System.out.println("포인트로 "+ amount+ "원 결제합니다.");
    }
}
