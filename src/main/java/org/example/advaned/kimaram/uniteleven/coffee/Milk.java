package org.example.advaned.kimaram.uniteleven.coffee;

// Concrete Decorators - Milk
public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public int cost() {
        return coffee.cost() + 500;
    }
}
