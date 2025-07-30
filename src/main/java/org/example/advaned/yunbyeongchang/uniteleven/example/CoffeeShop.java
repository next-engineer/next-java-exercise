package org.example.advaned.yunbyeongchang.uniteleven.example;

public class CoffeeShop {
    //var

    //method
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();

        coffee = new Milk(coffee);
        coffee = new Mocha(coffee);

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Price: " + coffee.cost() + "KRW");
    }

}
