package org.example.advaned.gojunho.uniteleven.pizza;

public class Cheese extends PizzaDecorator{
    public Cheese(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Cheess";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 2000;
    }
}
