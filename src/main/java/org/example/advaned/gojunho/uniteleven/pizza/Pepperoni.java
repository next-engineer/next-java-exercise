package org.example.advaned.gojunho.uniteleven.pizza;

public class Pepperoni extends PizzaDecorator{
    public Pepperoni(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Pepperoni";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+ 2000;
    }
}
