package org.example.advaned.gojunho.unitfourteen;

public class RateDiscount implements DiscountStrategy{
    @Override
    public int calculateDiscount(int price) {
        return (int)(price*0.9);
    }
}
