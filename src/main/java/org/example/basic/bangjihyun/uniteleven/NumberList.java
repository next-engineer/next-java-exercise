package org.example.basic.bangjihyun.uniteleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 9, 1, 6, 7, 4, 0);

        // 최대값과 최소값 찾기
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        // 오름차순 정렬
        List<Integer> sorted = new ArrayList<>(numbers); // 원본 유지
        Collections.sort(sorted);
        System.out.println("정렬된 리스트: " + sorted);
    }
}
