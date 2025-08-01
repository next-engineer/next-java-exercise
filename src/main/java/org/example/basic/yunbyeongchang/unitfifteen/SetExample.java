package org.example.basic.yunbyeongchang.unitfifteen;

import java.util.*;

public class SetExample {
    //var

    //method
    public static void main(String[] args) {
        //Set<String> fruits = new HashSet<>();
        Set<String> fruits = new TreeSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");

        for(String fruit:fruits) {
            System.out.println(fruit);
        }

    }
}

//순서 보장 x(HashSet 한정)
//중복 불가
//정렬 가능(TreeSet 한정)
