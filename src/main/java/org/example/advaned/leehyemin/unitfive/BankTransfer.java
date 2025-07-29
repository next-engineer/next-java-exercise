package org.example.advaned.leehyemin.unitfive;

public class BankTransfer implements Payment{
    @Override
    public void pay(int mount) {
        System.out.println("계좌이체로 "+mount+"원 결제합니다.");
    }
}
