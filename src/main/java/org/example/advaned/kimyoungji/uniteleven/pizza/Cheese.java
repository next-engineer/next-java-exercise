package org.example.advaned.kimyoungji.uniteleven.pizza;

public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", 치즈";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.50;
    }
}