package org.example.basic.leeseungyeon.unitsix;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class LambdaExample4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "avocado", "grape");

        Predicate<String> startsWithA = s -> s.startsWith("a");

        names.stream()
                .filter(startsWithA)
                .forEach(System.out::println); // 결과: apple, avocado

        //Predicate (조건 필터링)
    }
}