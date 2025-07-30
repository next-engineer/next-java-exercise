package org.example.basic.kimdonghyun.unitEight._2;



class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Credit card paid: " + amount);
    }
}