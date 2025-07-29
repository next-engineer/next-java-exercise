package org.example.advaned.kimaram.uniteleven.pizza;

// 데코레이터 추상 클래스
abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
