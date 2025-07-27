package org.example.basic.ANheebin.onepROJECT.unitsix;

import java.util.*;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("밥","스티브","제임스스");

        names.sort((a, b) -> a.length() - b.length());

        names.forEach(System.out::println);
    }
}
