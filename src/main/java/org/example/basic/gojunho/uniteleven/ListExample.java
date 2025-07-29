package org.example.basic.gojunho.uniteleven;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("과일 목록" + fruits);

        fruits.remove("Banana");
        fruits.add(1,"Mango");

        System.out.println("수정된 목록: "+fruits);
        System.out.println("첫 번째 과일: "+fruits.get(0));

        for(int i=0; i< fruits.size();i++){
            System.out.println((i+1)+". "+fruits.get(i));
        }
    }
}
