package org.example.advaned.kimaram.uniteleven.pizza;

// Concrete Decorators - Cheese
public class Cheese extends PizzaDecorator{
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 1000;
    }
}
