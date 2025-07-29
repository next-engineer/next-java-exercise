package org.example.advaned.yunbyeongchang.uniteleven.homework;

public class Cheese extends PizzaDecorator {
    //var

    //method
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public int getCost() {
        return pizza.getCost() + 1000;
    }

}
