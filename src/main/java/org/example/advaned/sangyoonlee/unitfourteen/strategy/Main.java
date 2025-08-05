package org.example.advaned.sangyoonlee.unitfourteen.strategy;

public class Main {
    public static void main(String[] args) {
        Order fixedOrder = new Order((DiscountStrategy) new FixedDiscount());
        fixedOrder.checkout(10000); // 9000원

        Order rateOrder = new Order((DiscountStrategy) new RateDiscount());
        rateOrder.checkout(10000); // 9000원
    }
}
