package org.example.basic.yunbyeongchang.uniteleven.homework.numberlist;

import java.util.*;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,3,7,4,9,6,2,8,5,10));

        //Max,Min 출력
        System.out.println("Max: " + CheckNumber.getMaxNumber(numberList));
        System.out.println("Min: " + CheckNumber.getMinNumber(numberList));

        //일반 전체 출력
        System.out.println(numberList);
        //오름차순 후 전체 출력
        CheckNumber.printNumberUpper(numberList);

        //Collection.sort를 사용했으므로 실제 numberList 값이 정렬된 채 유지
        System.out.println(numberList);

    }
}
