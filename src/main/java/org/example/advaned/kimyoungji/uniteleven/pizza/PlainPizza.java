package org.example.advaned.kimyoungji.uniteleven.pizza;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "플레인 피자(도우+소스)";
    }

    @Override
    public double getCost() {
        return 8.00; // 기본 가격
    }
}
