package org.example.basic.gojunho.unitsix;

import java.util.Arrays;
import java.util.List;

public class LambdfExample2 {
    public static void main(String args[]){
        List<String> names= Arrays.asList("Kim","Lee","Park","Choi");

        names.sort((a,b)->a.length()-b.length());

        names.forEach(System.out::println);
    }
}
