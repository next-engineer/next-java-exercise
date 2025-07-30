package org.example.advaned.leehyemin.uniteleven.coffee;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new Milk(coffee);
        coffee = new Mocha(coffee);

        System.out.println("주문 : "+coffee.getDescription());
        System.out.println("금액 : "+coffee.cost()+"원");
    }
}
