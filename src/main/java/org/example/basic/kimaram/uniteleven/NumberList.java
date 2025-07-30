package org.example.basic.kimaram.uniteleven;

import java.util.*;

// 과제 2. 숫자 리스트에서 최대값과 최소값 찾기
// 목표  : List<Integer>를 이용해 숫자들을 저장하고, 최대값과 최소값을 출력하세요.
public class NumberList {
    public static void main(String[] args) {
        // 1) 정수 10개를 List에 저장
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 2, 9, 1, 6, 7, 4, 0));

        // 2) 최대값과 최소값을 찾아 출력
        System.out.println("최대값: " + Collections.max(numbers));
        System.out.println("최소값: " + Collections.min(numbers));

        // 3) 오름차순 정렬 후 출력
        numbers.sort((a,b)-> a-b);
        System.out.println("[오름차순 정렬]");
        numbers.forEach(n -> System.out.print(n + " "));
    }
}
