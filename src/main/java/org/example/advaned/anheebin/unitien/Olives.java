package org.example.advaned.anheebin.unitien;

public class Olives extends PizzaDecorator {
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return getPizza().getDescription() + ", " + ToppingType.VEGETABLE.getDescription();
    }

    @Override
    public int getCost() {
        return getPizza().getCost() + ToppingType.VEGETABLE.getPrice();
    }
} 