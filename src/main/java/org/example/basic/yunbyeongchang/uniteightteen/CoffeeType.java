package org.example.basic.yunbyeongchang.uniteightteen;

public enum CoffeeType {
    AMERICANO(1000), LATTE(2000), CAPPUCCINO(3000);

    private final double price;

    CoffeeType(int price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
