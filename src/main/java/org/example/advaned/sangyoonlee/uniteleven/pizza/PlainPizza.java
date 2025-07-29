package org.example.advaned.sangyoonlee.uniteleven.pizza;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public long getCost() {
        return 8500;
    }
}
