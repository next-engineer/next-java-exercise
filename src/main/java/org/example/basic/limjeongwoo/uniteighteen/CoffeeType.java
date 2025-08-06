package org.example.basic.limjeongwoo.uniteighteen;

public enum CoffeeType {
    AMERICANO(3000), LATTE(4500), CAPPUCCINO(5000);

    private final int price;

    CoffeeType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

