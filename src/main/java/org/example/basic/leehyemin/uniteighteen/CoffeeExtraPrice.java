package org.example.basic.leehyemin.uniteighteen;

public enum CoffeeExtraPrice {
    SMALL(0), MEDIUM(1000), LARGE(2000);

    private final int extraPrice;

    CoffeeExtraPrice(int extraPrice) {
        this.extraPrice = extraPrice;
    }

    public int getExtraPrice() {
        return extraPrice;
    }
}
