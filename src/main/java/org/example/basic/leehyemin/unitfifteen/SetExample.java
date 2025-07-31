package org.example.basic.leehyemin.unitfifteen;

import java.util.HashSet;
import java.util.Set;

//set : 순서 x, 중복 x
public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
