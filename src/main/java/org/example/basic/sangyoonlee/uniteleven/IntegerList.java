package org.example.basic.sangyoonlee.uniteleven;

import java.util.*;

public class IntegerList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 8, 2, 9, 1, 6, 7, 4, 0));
        Integer maxNumber = Collections.max(numbers);
        Integer minNumber = Collections.min(numbers);

        System.out.printf("최대값: %d, 최소값: %d%n", maxNumber, minNumber);
        numbers.sort((a, b) -> Integer.compare(b, a));

        System.out.println("정렬된 리스트: " + numbers);
    }
}
