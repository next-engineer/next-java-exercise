package org.example.basic.yunbyeongchang.uniteleven.homework.numberlist;

import java.util.*;

public class CheckNumber {
    //var

    //method
    public static int getMaxNumber(List<Integer> list)
    {
        int var = list.get(0);      //List 값 내애서 비교하기 위해 상수가 아닌 0번째 인덱스 값으로 지정
        for(int num: list)
            if(var < num) var = num;

        return var;
    }

    public static int getMinNumber(List<Integer> list)
    {
        int var = list.get(0);      //List 값 내애서 비교하기 위해 상수가 아닌 0번째 인덱스 값으로 지정
        for(int num: list)
            if(var > num) var = num;

        return var;
    }

    public static void printNumberUpper(List<Integer> list)
    {
        Collections.sort(list);
        System.out.println(list);
    }
}
