package org.example.advaned.gojunho.uniteleven.coffee;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee){
        super(coffee);
    }
    public String getDescription(){
        return coffee.getDescription()+ ", Milk";
    }

    public int cost(){
        return coffee.cost() + 500;
    }
}
