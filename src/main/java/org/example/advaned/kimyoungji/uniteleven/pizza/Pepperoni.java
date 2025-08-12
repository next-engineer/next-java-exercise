package org.example.advaned.kimyoungji.uniteleven.pizza;

public class Pepperoni extends PizzaDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", 페퍼로니";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.00;
    }
}