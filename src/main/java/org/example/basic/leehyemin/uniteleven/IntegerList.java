package org.example.basic.leehyemin.uniteleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
         numbers.add(5);
         numbers.add(3);
         numbers.add(8);
         numbers.add(2);
         numbers.add(9);
         numbers.add(1);
         numbers.add(6);
         numbers.add(7);
         numbers.add(4);
         numbers.add(0);

        System.out.println("최대값 : "+ Collections.max(numbers));
        System.out.println("최소값 : "+ Collections.min(numbers));

        Collections.sort(numbers);
        System.out.println("정렬 : "+numbers);
    }
}
