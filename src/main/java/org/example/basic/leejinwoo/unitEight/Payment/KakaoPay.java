package org.example.basic.leejinwoo.unitEight.Payment;

public class KakaoPay implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("KakaoPay paid: " + amount);
    }
}
