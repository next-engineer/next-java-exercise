package org.example.basic.mindongil.uniteight;

public class KakaoPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("KakaoPay paid: " + amount);
    }
}
