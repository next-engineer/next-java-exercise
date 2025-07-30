package org.example.advaned.kimaram.uniteleven.pizza;

// Concrete Decorators - Olives
public class Olives extends PizzaDecorator{
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 2000;
    }
}
