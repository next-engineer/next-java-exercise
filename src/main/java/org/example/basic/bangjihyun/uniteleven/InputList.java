package org.example.basic.bangjihyun.uniteleven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fruits = new ArrayList<>();

        System.out.println("과일 이름 5개를 입력하세요:");

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 과일: ");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }

        System.out.println("입력한 과일 목록: " + fruits);
        scanner.close();
    }
}
