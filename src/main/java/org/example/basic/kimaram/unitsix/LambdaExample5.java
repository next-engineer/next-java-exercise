package org.example.basic.kimaram.unitsix;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// 5. Function - 변환 후 출력
public class LambdaExample5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");

        // Function : 함수형 인터페이스로 입력값을 받아 다른 타입의 값을 반환하는 역할.
        Function<String, Integer> lengthFunction = s -> s.length();

        list.stream()
                .map(lengthFunction)
                .forEach(System.out::println); // 결과: 3, 3, 5
    }
}
