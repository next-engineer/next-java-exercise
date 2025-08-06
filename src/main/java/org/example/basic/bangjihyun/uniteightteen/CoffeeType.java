package org.example.basic.bangjihyun.uniteightteen;

public enum CoffeeType {
    AMERICANO(3000), LATTE(4000), CAPPUCCINO(4500);

    private final int price;

    CoffeeType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
