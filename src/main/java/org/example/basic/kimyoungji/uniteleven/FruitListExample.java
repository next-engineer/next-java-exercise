package org.example.basic.kimyoungji.uniteleven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fruits = new ArrayList<>();

        // 사용자에게 과일 이름 입력받기
        System.out.println("과일 이름 5개를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 과일: ");
            fruits.add(scanner.nextLine());
        }

        // 입력된 리스트 출력
        System.out.println("입력된 과일 목록: " + fruits);

        scanner.close();
    }
}