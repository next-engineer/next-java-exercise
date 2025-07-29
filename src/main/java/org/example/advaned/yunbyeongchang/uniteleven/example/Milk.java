package org.example.advaned.yunbyeongchang.uniteleven.example;

public class Milk extends CoffeeDecorator{
    //var

    //method
    public Milk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public int cost() {
        return coffee.cost() + 500;
    }

}
