package org.example.basic.ANheebin.onepROJECT.uniteight;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("신용카드로 " + amount + "원 결제");
    }
}

class kakaopay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이로 " + amount + "원 결제");
    }
    
    public class Main {
        public static void main(String[] args) {
            Payment method;

            method = new CreditCardPayment();
            method.pay(5000);

            method = new kakaopay();
            method.pay(7000);
        }
    }
}
