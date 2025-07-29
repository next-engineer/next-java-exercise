package org.example.advaned.leejinwoo.unitEleven;

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
        return pizza.getCost() + 1000;
    }
}
