package org.example.advaned.leehyemin.uniteleven.pizza;

public class Pepperoni extends PizzaDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    public int cost() {
        return pizza.cost() + 500;
    }
}
