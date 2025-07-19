package org.example.basic.sangyoonlee.uintsix;

import java.util.function.BiFunction;

public class Calculator {

    public static int methodAdd(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> lambdaAdd = (x, y) -> x + y; // Integer::sum 으로 쓸 수 있음

        int methodAddResult = methodAdd(5465, 648);
        int lambdaAddResult = lambdaAdd.apply(5465, 648);

        System.out.println("method: " + methodAddResult);
        System.out.println("lambda: " + lambdaAddResult);
    }
}
