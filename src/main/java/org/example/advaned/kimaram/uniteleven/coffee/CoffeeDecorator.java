package org.example.advaned.kimaram.uniteleven.coffee;

// 데코레이터 추상 클래스
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
