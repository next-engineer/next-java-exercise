package org.example.advaned.kimaram.uniteleven.pizza;

// Concrete Decorators - Pepperoni
public class Pepperoni extends PizzaDecorator{
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 1500;
    }
}
