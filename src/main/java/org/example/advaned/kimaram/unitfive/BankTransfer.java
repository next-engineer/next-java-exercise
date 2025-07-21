package org.example.advaned.kimaram.unitfive;

public class BankTransfer implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("계좌로 " + amount + "원 출금합니다.");
    }
}
