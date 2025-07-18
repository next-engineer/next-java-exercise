package org.example.basic.yunbyeongchang.unitsix.lambda;

import java.util.function.Function;
import java.util.Arrays;
import java.util.List;

public class LambdaExample5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");

        // Function<T, R>: 객체 T를 객체 R로 매핑(변환)
        Function<String, Integer> lengthFunction = s -> s.length(); // 글자 수를 int로 매핑

        list.stream()                   // 원본 파일을 건드리지 않고
                .map(lengthFunction)    // map: key를 통해 value를 얻음
                .forEach(System.out::println); // 결과: 3, 3, 5
    }
}
