package org.example.basic.kimdonghyun.unitEleven;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // 1. 정수 10개 저장
        Collections.addAll(numbers, 8, 3, 2, 9, 1, 6, 7, 7, 4, 0);

        // 2. 최대값과 최소값 출력
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("최대값: " + max + ", 최소값: " + min);

        // 3. 오름차순 정렬
        Collections.sort(numbers);
        System.out.println("정렬된 리스트: " + numbers);
    }
}