package org.example.basic.leejinwoo.unitEighteen;

public enum  CoffeeType {
    AMERICANO(2000), LATTE(3000), CAPPUCCINO(3500);

    private final int account;

    CoffeeType(int account) {
        this.account = account;
    }

    public int getAccount(){
        return account;
    }
}

