package org.example.basic.kimdonghyun.unitSix;


import java.util.function.Function;
import java.util.Arrays;
import java.util.List;

public class lambda5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");

        Function<String, Integer> lengthFunction = s -> s.length();

        list.stream()
                .map(lengthFunction)
                .forEach(System.out::println); // 결과: 3, 3, 5
    }
}
