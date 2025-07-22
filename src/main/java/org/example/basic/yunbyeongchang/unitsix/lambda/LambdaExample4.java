package org.example.basic.yunbyeongchang.unitsix.lambda;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class LambdaExample4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "avocado", "grape");

        // Predicate: arguments를 받아 bool값을 반롼하는 함수형 인터페이스
        Predicate<String> startsWithA = s -> s.startsWith("a"); // a로 시작하면 true

        names.stream()      // 원본을 수정하지 않음
                .filter(startsWithA)    // Predicate로 true/false 매칭
                .forEach(System.out::println); // 결과: apple, avocado
    }
}

