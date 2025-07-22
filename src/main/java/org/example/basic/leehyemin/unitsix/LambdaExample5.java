package org.example.basic.leehyemin.unitsix;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Function Interface : 하나의 입력을 받아 하나의 결과를 반환하는 함수형 인터페이스
//Function<T, R> : T 입력 값, R 반환 값
public class LambdaExample5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("leehyemin", "leehyunsoo", "leetaeseok");

        Function<String, Integer> lengthFunction = s -> s.length();

        list.stream()
                .map(lengthFunction)
                .forEach(System.out::println);
    }
}
