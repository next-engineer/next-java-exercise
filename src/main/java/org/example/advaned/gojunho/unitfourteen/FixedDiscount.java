package org.example.advaned.gojunho.unitfourteen;

public class FixedDiscount implements DiscountStrategy{
    @Override
    public int calculateDiscount(int price) {
        return price-1000;
    }
}
