package org.example.basic.kimyoungji.uniteleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // 정수 10개 추가
        int[] values = {5, 3, 8, 2, 9, 1, 6, 7, 4, 0};
        for (int num : values) {
            numbers.add(num);
        }

        // 최대값, 최소값 출력
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("최대값: " + max + ", 최소값: " + min);

        // 오름차순 정렬
        Collections.sort(numbers);
        System.out.println("정렬된 리스트: " + numbers);
    }
}
