package org.example.advaned.sangyoonlee.uniteleven.pizza;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new Cheese(pizza);
        pizza = new Pepperoni(pizza);

        System.out.println("Order: " + pizza.getDescription());
        System.out.printf("Price: %,d원%n", pizza.getCost());
    }
}
