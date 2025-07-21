package org.example.basic.kimyoungji.unitsix.lambda;

import java.util.function.BiFunction;

public class Calculator {

    public static void main(String[] args) {
        // 람다식 정의
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        // 람다식 호출
        int result = add.apply(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
