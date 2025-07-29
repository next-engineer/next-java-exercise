package org.example.basic.leehyemin.uniteleven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> fruits = new ArrayList<>();

        final int num = 3;
        System.out.println("과일 이름을 "+num+"개 써주세요.");

        for(int i = 0; i < num; i++){
            fruits.add(sc.nextLine());
        }

        System.out.println(fruits);

//        String fruit1 = sc.nextLine();
//        fruits.add(fruit1);
//
//        String fruit2 = sc.nextLine();
//        fruits.add(fruit2);
//
//        String fruit3 = sc.nextLine();
//        fruits.add(fruit3);
//
//        String fruit4 = sc.nextLine();
//        fruits.add(fruit4);
//
//        String fruit5 = sc.nextLine();
//        fruits.add(fruit5);
    }
}
