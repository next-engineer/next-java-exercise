package org.example.advaned.anheebin.unitien;


public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return getPizza().getDescription() + ", " + ToppingType.CHEESE.getDescription();
    }

    @Override
    public int getCost() {
        return getPizza().getCost() + ToppingType.CHEESE.getPrice();
    }
} 