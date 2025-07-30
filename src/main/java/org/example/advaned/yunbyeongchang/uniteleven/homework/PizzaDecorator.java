package org.example.advaned.yunbyeongchang.uniteleven.homework;

public abstract class PizzaDecorator extends PlanePizza{
    //var
    protected Pizza pizza;
    protected int count = 1;

    //method
    public PizzaDecorator(Pizza pizza) {
        PizzaDecorator anotherDecorator = findSameDecorator(pizza);
        if(anotherDecorator != null && anotherDecorator.getClass() == this.getClass()) {    //토핑이 존재하고 이미 같은 종류의 토핑이 있다면
            anotherDecorator.incrementCount();                                              //기존 토핑의 카운트 증가
            this.count = 0;                                                                 //새로 추가된 토핑의 카운트는 제외(총 갯수와 가격만 계산할 것이므로)
        }

        this.pizza = pizza;
    }

    private PizzaDecorator findSameDecorator(Pizza pizza) {      //같은 클래스의 데코레이더가 있는지 탐색
        PizzaDecorator result = null;                           //같은 토핑이 없는 상태를 default로 지정

        while(pizza instanceof PizzaDecorator) {                //데코레이터 순회
            PizzaDecorator decorator = (PizzaDecorator) pizza;  //가독성을 위해 변수 선언

            if(decorator.getClass() == this.getClass() && decorator.count > 0) {           //현재 데코레이터와 클래스(토핑)가 같고 카운트가 0이 아니라면(새로 선언된 유효한 토핑이라면)
                result = decorator;
            }
            pizza = decorator.pizza;             //다음 데코레이터로 이동
        }
        return result;
    }

    private void incrementCount()
    {
        this.count++;
    }

}
