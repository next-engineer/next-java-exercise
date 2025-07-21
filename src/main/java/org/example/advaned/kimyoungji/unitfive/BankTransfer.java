package org.example.advaned.kimyoungji.unitfive;

public class BankTransfer implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("계좌이체로 " + amount + "원 결제합니다.");
    }
}