package org.example.advaned.gojunho.uniteleven.coffee;

abstract public class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }
}
