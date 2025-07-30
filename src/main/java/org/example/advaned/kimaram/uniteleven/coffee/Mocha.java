package org.example.advaned.kimaram.uniteleven.coffee;

// Concrete Decorators - Mocha
public class Mocha extends CoffeeDecorator{
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Mocha";
    }

    @Override
    public int cost() {
        return coffee.cost() + 700;
    }
}
