package org.example.advaned.leejinwoo.unitEleven;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new Cheese(pizza);
        pizza = new Pepperoni(pizza);
        pizza = new Olives(pizza);

        System.out.println("order : " + pizza.getDescription());
        System.out.println("cost : " + pizza.getCost());
    }
}
