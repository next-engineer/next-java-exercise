package org.example.basic.kimdonghyun.unitSix;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class lambda4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "avocado", "grape");

        Predicate<String> startsWithA = s -> s.startsWith("a");

        names.stream()
                .filter(startsWithA)
                .forEach(System.out::println); // 결과: apple, avocado
    }
}
