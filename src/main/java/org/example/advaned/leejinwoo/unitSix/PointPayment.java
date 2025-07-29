package org.example.advaned.leejinwoo.unitSix;

public class PointPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Pay " + amount + " by Point");
    }
}
