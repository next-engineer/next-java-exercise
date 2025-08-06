package org.example.basic.yunbyeongchang.uniteightteen;

public enum CoffeeSize {
    SMALL(250, 1.0), MEDIUM(350, 1.2), LARGE(450, 1.5);

    private final int ml;
    private final double priceMultiplier;

    CoffeeSize(int ml, double priceMultiplier) {
        this.ml = ml;
        this.priceMultiplier = priceMultiplier;
    }

    public int getMl() {
        return ml;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }
}
