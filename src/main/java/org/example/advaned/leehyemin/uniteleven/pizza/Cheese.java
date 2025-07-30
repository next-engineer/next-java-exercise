package org.example.advaned.leehyemin.uniteleven.pizza;

public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription()+ ", Cheese";
    }

    public int cost() {
        return pizza.cost() + 1000;
    }
}
