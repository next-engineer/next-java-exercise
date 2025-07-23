package org.example.advaned.gojunho.unitfive;

public class CardPayment implements Payment{
    public void pay(int amount){
        System.out.println("카드로 "+ amount+"원 결제합니다.");
    }
}
