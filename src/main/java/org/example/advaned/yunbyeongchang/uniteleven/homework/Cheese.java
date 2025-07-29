package org.example.advaned.yunbyeongchang.uniteleven.homework;

public class Cheese extends PizzaDecorator {
    //var

    //method
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        if(count == 0) {                    //토핑이 없을 때, 혹은 중복된 토핑 상태일 때
            return pizza.getDescription();
        }

        return pizza.getDescription() + ", Cheese" + (count > 1 ? " x" + count : "");       // 토핑이 1개면 x count 출력하지 않음
    }

    public int getCost() {
        return pizza.getCost() + (1000 * count);
    }

}
