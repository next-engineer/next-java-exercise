package org.example.advaned.kimaram.uniteleven.coffee;

// 기본 컴포넌트
public class BasicCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public int cost() {
        return 3000;
    }
}
