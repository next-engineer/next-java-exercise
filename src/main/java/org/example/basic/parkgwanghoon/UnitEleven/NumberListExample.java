package org.example.basic.parkgwanghoon.UnitEleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberListExample {
    public static void main(String[] args) {
        // 1. 정수 10개를 List에 저장
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 15, 3, 8, 28, 9, 31, 6, 17, 49, 90);

        // 2. 최대값과 최소값 출력
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("🔺 최대값: " + max + ", 🔻 최소값: " + min);

        // 3. 오름차순 정렬
        Collections.sort(numbers);
        System.out.println("📊 정렬된 리스트: " + numbers);
    }
}