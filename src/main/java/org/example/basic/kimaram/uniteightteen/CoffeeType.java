package org.example.basic.kimaram.uniteightteen;

// 추가미션 1. 각 커피 종류에 가격 추가하고 총 가격 출력하기
public enum CoffeeType {
    AMERICANO(4000), LATTE(5500), CAPPUCCINO(6000);

    private final int price;

    CoffeeType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
