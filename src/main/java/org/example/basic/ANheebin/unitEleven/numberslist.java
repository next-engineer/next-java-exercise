package main.java.org.example.basic.ANheebin.unitEleven;

import java.util.*;

public class numberslist {
    public static void main(String[] args) {
        // 정수 10개를 List에 저장
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(8);
        arr.add(2);
        arr.add(9);
        arr.add(1);
        arr.add(6);
        arr.add(7);
        arr.add(4);
        arr.add(0);

        
        int min = Collections.min(arr);
        int max = Collections.max(arr);

      
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        Collections.sort(arr);

        
        System.out.println("정렬된 리스트: " + arr);
    }
}
