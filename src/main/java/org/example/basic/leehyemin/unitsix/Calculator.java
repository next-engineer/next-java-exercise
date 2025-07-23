package org.example.basic.leehyemin.unitsix;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Calculator {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        int result = add.apply(1, 2);
        System.out.println(result);

        Function<Integer, Integer> square = (a) -> a * a;
        int result2 = square.apply(5);
        System.out.println(result2);

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> {
            int result3 = a + b;
            return result3;
        };
        System.out.println(sum.apply(5, 6));

        Runnable run = () -> System.out.println("Hello Lambda!");
        run.run();

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Comparator<Integer> comp = (a, b) -> a - b;
        Collections.sort(list, comp);
        System.out.println(list);

        List<String> list1 = List.of("leehyemin", "leehyunsoo", "leetaeseok", "leejeonggun", "kwonseoyoung");
        list1.stream()
                .filter(s -> s.contains("leeh"))
                .forEach(s -> System.out.println(s));

        MyFunction myFunction=(a,b)->a+b;
        System.out.println(myFunction.doSomething(1,2));
    }
}
