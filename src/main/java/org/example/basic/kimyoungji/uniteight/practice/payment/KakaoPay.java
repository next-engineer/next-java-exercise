package org.example.basic.kimyoungji.uniteight.practice.payment;

public class KakaoPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("KakaoPay paid: " + amount);
    }
}
