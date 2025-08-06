package org.example.basic.kimaram.uniteightteen;

public enum CoffeeSize {
    SMALL(250, 0), MEDIUM(350, 500), LARGE(450, 1000);

    private final int ml;
    private final int price;

    CoffeeSize(int ml, int price) {
        this.ml = ml;
        this.price = price;
    }

    public int getMl() {
        return ml;
    }

    public int getPrice() {
        return price;
    }
}
