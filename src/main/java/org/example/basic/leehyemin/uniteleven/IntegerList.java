package org.example.basic.leehyemin.uniteleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntegerList {
    private void validateList(List<Integer> numbers) {
        if(numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("리스트가 비어있습니다.");
        }
    }

    public int calculateMax(List<Integer> numbers) {
        validateList(numbers);

        int max = numbers.get(0);
        for(int number : numbers) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }

    public int calculateMin(List<Integer> numbers) {
        validateList(numbers);

        int min = numbers.get(0);
        for(int number : numbers) {
            if(number < min) {
                min = number;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5,3,8,2,9,1,6,7,4,0));

//        System.out.println("최대값 : "+ Collections.max(numbers));
//        System.out.println("최소값 : "+ Collections.min(numbers));

        Collections.sort(numbers);
        System.out.println("정렬 : "+numbers);

        IntegerList integerList = new IntegerList();

        int maxValue = integerList.calculateMax(numbers);
        System.out.println("최대값 : "+maxValue);

        int minValue = integerList.calculateMin(numbers);
        System.out.println("최소값 : "+minValue);
    }
}
