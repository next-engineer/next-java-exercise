package org.example.advaned.anheebin.unitien;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    
    protected Pizza getPizza() {
        return pizza;
    }
    
    public abstract String getDescription();

    public abstract int getCost();


} 