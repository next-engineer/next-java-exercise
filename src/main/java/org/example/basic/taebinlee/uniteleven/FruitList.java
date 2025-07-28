package org.example.basic.taebinlee.uniteleven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fruits = new ArrayList<>();

        System.out.println("원하는 과일을 입력하시오 : ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "번째 과일: ");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }

        System.out.println("과일 리스트: " + fruits);
        scanner.close();
    }
}
