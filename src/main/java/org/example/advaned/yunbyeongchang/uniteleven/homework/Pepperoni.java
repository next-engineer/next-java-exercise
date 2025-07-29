package org.example.advaned.yunbyeongchang.uniteleven.homework;

public class Pepperoni extends PizzaDecorator{
    //var

    //method
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    public int getCost() {
        return pizza.getCost() + 700;
    }

}
