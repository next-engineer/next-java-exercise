package org.example.advaned.yunbyeongchang.uniteleven.homework;

public class Pepperoni extends PizzaDecorator{
    //var

    //method
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        if(count == 0) {                    //토핑이 없을 때, 혹은 중복된 토핑 상태일 때
            return pizza.getDescription();
        }
        return pizza.getDescription() + ", Pepperoni"  + (count > 1 ? " x" + count : "");
    }

    public int getCost() {
        return pizza.getCost() + (700 * count);
    }

}
