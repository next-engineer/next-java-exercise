package org.example.basic.kimyoungji.uniteight.practice.payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Credit card paid: " + amount);
    }
}
