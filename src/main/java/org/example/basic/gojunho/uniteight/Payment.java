package org.example.basic.gojunho.uniteight;

public interface Payment {
    void pay(int amount);
}

class CreditCardPayment implements Payment{
    public void pay(int amount){
        System.out.println("Credit card paid: "+amount);
    }
}

class KakaoPay implements Payment{
    public void pay(int amount){
        System.out.println("KakaoPay paid: "+amount);
    }
}