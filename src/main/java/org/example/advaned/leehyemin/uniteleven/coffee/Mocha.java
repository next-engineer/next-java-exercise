package org.example.advaned.leehyemin.uniteleven.coffee;

public class Mocha extends CoffeeDecorator {
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
