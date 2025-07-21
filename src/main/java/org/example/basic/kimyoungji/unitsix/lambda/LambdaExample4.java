package org.example.basic.kimyoungji.unitsix.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "avocado", "grape");

        Predicate<String> startsWithA = s -> s.startsWith("a");

        names.stream()
                .filter(startsWithA)
                .forEach(System.out::println); // 결과: apple, avocado
    }
}
