package org.example.basic.yunbyeongchang.unitsix.lambda;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class LambdaExample3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30);

        // Consumer: 입력값은 받지만 반환값은 없는 연산을 수행할 때 사용
        Consumer<Integer> printNum = n -> System.out.println("값: " + n);    // List 출력

        nums.forEach(printNum);
    }
}
