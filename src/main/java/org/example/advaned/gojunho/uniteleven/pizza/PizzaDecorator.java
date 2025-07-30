package org.example.advaned.gojunho.uniteleven.pizza;

abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
}
