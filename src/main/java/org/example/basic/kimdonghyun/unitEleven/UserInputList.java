package org.example.basic.kimdonghyun.unitEleven;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fruits = new ArrayList<>();

        System.out.println("과일 이름 5개를 입력하세요:");

        // 사용자에게 과일 이름 5개 입력받기
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 과일: ");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }

        // 리스트 출력
        System.out.println("입력한 과일 리스트: " + fruits);

        scanner.close();
    }
}