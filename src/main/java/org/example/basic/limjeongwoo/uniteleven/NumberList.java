package org.example.basic.limjeongwoo.uniteleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 9, 1, 6, 7, 4, 0);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("최대값: " + max + ", 최소값: " + min);

        Collections.sort(numbers);
        System.out.println("정렬된 리스트: " + numbers);
    }
}
