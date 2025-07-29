package org.example.advaned.kimaram.uniteleven.pizza;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new Cheese(pizza);
        pizza = new Pepperoni(pizza);

        System.out.println("Order: " + pizza.getDescription());
        System.out.println("Price: " + pizza.getCost() +"원");
    }
}
