package org.example.advaned.yunbyeongchang.unitfourteen.example;

public class FixedDiscount implements DiscountStrategy {

    //method
    public int calculateDiscount(int price) {
        return price - 1000;
    }
}
