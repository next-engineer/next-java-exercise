package org.example.advaned.yunbyeongchang.uniteleven.homework;

public class PizzaSchool {
    //var

    //method
    public static void main(String[] args) {
        Pizza pizza = new PlanePizza();

        pizza = new Cheese(pizza);
        pizza = new Pepperoni(pizza);
        pizza = new Cheese(pizza);

        System.out.println("Order: " + pizza.getDescription());
        System.out.println("Price: " + pizza.getCost() + "KRW");
    }
}
