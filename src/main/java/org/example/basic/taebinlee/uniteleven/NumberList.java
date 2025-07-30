package org.example.basic.taebinlee.uniteleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9,4,5,1,3,2,7,8,6,0);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);


        // 정렬하여 출력
        Collections.sort(numbers);
        System.out.println("정렬하여 리스트 출력 : " + numbers);
    }
}
