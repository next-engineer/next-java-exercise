package org.example.advaned.yunbyeongchang.uniteleven.homework;

public abstract class PizzaDecorator extends PlanePizza{
    //var
    protected Pizza pizza;

    //method
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

}
