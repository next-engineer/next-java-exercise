package org.example.advaned.yunbyeongchang.uniteleven.example;

public class Mocha extends CoffeeDecorator{
    //var

    //method
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Mocha";
    }

    public int cost() {
        return coffee.cost() + 700;
    }

}
