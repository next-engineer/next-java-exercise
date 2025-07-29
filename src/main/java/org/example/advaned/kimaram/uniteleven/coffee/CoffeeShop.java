package org.example.advaned.kimaram.uniteleven.coffee;

// 실행
public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new Milk(coffee);
        coffee = new Mocha(coffee);

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Price: "+ coffee.cost() + "원");
    }
}
