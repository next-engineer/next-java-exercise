package org.example.advaned.yunbyeongchang.unitfourteen.example;

public class Order {
    //var
    private final DiscountStrategy discountStrategy;

    //method
    public Order(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void checkout(int price) {
        int discounted = discountStrategy.calculateDiscount(price);
        System.out.println("최종 결제 금액: " + discounted + "원");
    }
}

