package org.example.basic.kimdonghyun.unitSix;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class lambda3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30);

        Consumer<Integer> printNum = n -> System.out.println("값: " + n);

        nums.forEach(printNum);
    }
}
