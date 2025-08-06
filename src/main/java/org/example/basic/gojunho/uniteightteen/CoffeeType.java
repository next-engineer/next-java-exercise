package org.example.basic.gojunho.uniteightteen;

public enum CoffeeType {
    AMERICANO(5000), LATTE(7000), CAPPUCCINO(8000);

    private final int price;

    CoffeeType(int price){
        this.price=price;
    }
    public int getprice(){
        return price;
    }
}
