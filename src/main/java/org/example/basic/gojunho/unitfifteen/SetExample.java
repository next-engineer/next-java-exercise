package org.example.basic.gojunho.unitfifteen;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args){
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
