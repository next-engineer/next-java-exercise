package org.example.basic.kimaram.unitsix;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// 4. Predicate - 조건 필터링
public class LambdaExample4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "avocado", "grape");

        // Predicate : 함수형 인터페이스로 조건 검사 로직을 표현한 것.
        Predicate<String> startsWithA = s -> s.startsWith("a");

        // stream (스트림) : 데이터 컬렉션의 요소들을 람다식으로 처리할 수 있도록 해주는 API
        // 람다식과 스트림의 관계 : 스트림은 람다식의 데이터 처리 연산에 활용하여 컬렉션 데이터를 처리한다.
        names.stream()
                .filter(startsWithA)
                .forEach(System.out::println); // 결과: apple, avocado
    }
}
