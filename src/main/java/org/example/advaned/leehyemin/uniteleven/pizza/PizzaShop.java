package org.example.advaned.leehyemin.uniteleven.pizza;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new Cheese(pizza);
        pizza = new Pepperoni(pizza);

        System.out.println("주문 : "+pizza.getDescription());
        System.out.println("금액 : "+pizza.cost()+"원");
    }
}
