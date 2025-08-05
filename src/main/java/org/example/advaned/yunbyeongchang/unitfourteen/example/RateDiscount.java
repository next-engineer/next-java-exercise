package org.example.advaned.yunbyeongchang.unitfourteen.example;

public class RateDiscount implements DiscountStrategy {

    //method
    public int calculateDiscount(int price) {
        return (int) (price * 0.9);
    }
}
