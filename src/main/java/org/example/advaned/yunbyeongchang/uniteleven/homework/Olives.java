package org.example.advaned.yunbyeongchang.uniteleven.homework;

public class Olives extends PizzaDecorator {
    //var

    //method
    public Olives(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public int getCost() {
        return pizza.getCost() + 500;
    }

}
