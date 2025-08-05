package org.example.advaned.sangyoonlee.unitfourteen.strategy;

public class Order {
    private final DiscountStrategy discountStrategy;

    public Order(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void checkout(int price) {
        int discounted = discountStrategy.calculateDiscount(price);
        System.out.println("최종 결제 금액: " + discounted + "원");
    }
}
