package org.example.advaned.sangyoonlee.uniteleven.pizza;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public long getCost() {
        return pizza.getCost() + 9000;
    }

}
