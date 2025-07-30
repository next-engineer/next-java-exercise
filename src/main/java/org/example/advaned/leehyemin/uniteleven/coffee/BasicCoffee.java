package org.example.advaned.leehyemin.uniteleven.coffee;

public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }
    @Override
    public int cost() {
        return 3000;
    }
}
