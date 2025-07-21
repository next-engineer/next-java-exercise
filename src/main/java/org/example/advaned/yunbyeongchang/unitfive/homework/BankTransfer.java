package org.example.advaned.yunbyeongchang.unitfive.homework;

public class BankTransfer implements Payment{
    //method
    public void pay(int amount) {
        System.out.println("계좌로 " + amount + "원 결제합니다.");
    }
}
