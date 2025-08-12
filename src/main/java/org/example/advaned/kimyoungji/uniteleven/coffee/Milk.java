package org.example.advaned.kimyoungji.uniteleven.coffee;

class Milk extends CoffeeDecorator {
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