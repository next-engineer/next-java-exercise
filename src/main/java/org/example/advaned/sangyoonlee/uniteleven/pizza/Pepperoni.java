package org.example.advaned.sangyoonlee.uniteleven.pizza;

public class Pepperoni extends PizzaDecorator {

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    @Override
    public long getCost() {
        return pizza.getCost() + 9500;
    }

}
