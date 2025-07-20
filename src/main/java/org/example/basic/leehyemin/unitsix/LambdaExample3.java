package org.example.basic.leehyemin.unitsix;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Consumer Interface : 하나의 입력을 받아서 처리하는 함수형 인터페이스
// 결과를 반환하지 않고 단순히 작업만 수행, 대표적으로 출력, 저장, 로그 남기기 같은 작업할 때 사용
public class LambdaExample3 {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Consumer<Integer> printNum = n-> System.out.println("값 : "+n);

        nums.forEach(printNum);
    }
}
