package org.example.basic.kimaram.unitsix;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// 3. Consumer - forEach로 출력
public class LambdaExample3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30);

        // Consumer : 함수형 인터페이스로 하나의 입력을 받아 처리 하지만 아무것도 반환하지 않는다.
        Consumer<Integer> printNum = n -> System.out.println("값: " + n);

        nums.forEach(printNum);
    }
}
