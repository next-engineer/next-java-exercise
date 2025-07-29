package org.example.advaned.kimaram.uniteleven.pizza;

// 기본 컴포넌트
public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public int getCost() {
        return 6000;
    }
}
