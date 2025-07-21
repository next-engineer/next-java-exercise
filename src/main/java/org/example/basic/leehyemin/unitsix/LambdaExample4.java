package org.example.basic.leehyemin.unitsix;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Predicate 인터페이스 : 하나의 입력을 받아서 참/거짓을 반환하는 함수형 인터페이스, 어떤 조건을 검사하는데 특화
public class LambdaExample4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "orange", "avocado");

        Predicate<String> startWithA = s -> s.startsWith("a");

        names.stream()
                .filter(startWithA)
                .forEach(System.out::println);
    }
}
