package org.example.basic.bangjihyun.uniteightteen;

public enum CoffeeSize {
    SMALL(250, 0),
    MEDIUM(350, 500),
    LARGE(450, 1000);

    private final int ml;
    private final int extraPrice; // 추가 가격

    CoffeeSize(int ml, int extraPrice) {
        this.ml = ml;
        this.extraPrice = extraPrice;
    }

    public int getMl() {
        return ml;
    }

    public int getExtraPrice() {
        return extraPrice;
    }
}