package org.example.advaned.gojunho.unitfourteen;

public class Main {
    public static void main(String[] args){
        Order fixedOrder = new Order(new FixedDiscount());
        fixedOrder.checkout(10000);

        Order rateOrder = new Order(new RateDiscount());
        rateOrder.checkout(10000);
    }
}
