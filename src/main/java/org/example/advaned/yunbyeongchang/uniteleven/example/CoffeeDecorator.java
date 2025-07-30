package org.example.advaned.yunbyeongchang.uniteleven.example;

public abstract class CoffeeDecorator implements Coffee {
    //var
    protected  Coffee coffee;

    //method
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
