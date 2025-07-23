package org.example.basic.ANheebin.onepROJECT.unitsix;

import java.util.*;
import java.util.function.Consumer;

public class LambdaExample3 {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(10, 20, 30);

        Consumer<Integer> printNum = n -> System.out.println("값: " + n);

        nums.forEach(printNum);
    
}
}
