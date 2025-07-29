package org.example.advaned.leejinwoo.unitEleven;

public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public int getCost() {
        return 10000;
    }
}
