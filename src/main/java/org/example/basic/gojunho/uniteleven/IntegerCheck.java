package org.example.basic.gojunho.uniteleven;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntegerCheck {
    public static void main(String[] args){
        List<Integer> NumList = new ArrayList<>(Arrays.asList(5,3,8,2,9,1,6,7,4,0));
        System.out.println("입력: "+NumList);
        int Max= 0;
        int Min= 0;
        Collections.sort(NumList);
        for(int i=0;i < NumList.size();i++){
            if(NumList.get(i) > Max){
                Max=NumList.get(i);
            }
            else if(NumList.get(i) < Min){
                Min=NumList.get(i);
            }
        }
        System.out.println("최대값: "+Max+", 최소값: "+Min);
        System.out.println("정렬된 리스트: "+NumList);
    }
}
