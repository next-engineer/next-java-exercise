package org.example.advaned.gojunho.uniteleven.pizza;

public class Main {
    public static void main(String[] args){
        Pizza pizza=new PlainPizza();
        pizza=new Cheese(pizza);
        pizza=new Olives(pizza);
        
        System.out.println("Order: "+pizza.getDescription());
        System.out.println("Price: "+pizza.getCost()+"원");
    }
}
