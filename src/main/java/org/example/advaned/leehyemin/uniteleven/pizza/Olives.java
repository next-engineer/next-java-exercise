package org.example.advaned.leehyemin.uniteleven.pizza;

public class Olives extends PizzaDecorator {
    public Olives(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public int cost() {
        return pizza.cost() + 500;
    }
}
