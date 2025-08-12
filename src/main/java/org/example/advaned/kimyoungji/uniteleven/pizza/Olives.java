package org.example.advaned.kimyoungji.uniteleven.pizza;

public class Olives extends PizzaDecorator {
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", 올리브";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.00;
    }
}