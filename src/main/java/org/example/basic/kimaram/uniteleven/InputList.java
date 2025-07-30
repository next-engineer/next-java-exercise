package org.example.basic.kimaram.uniteleven;

import java.util.*;

// 과제 3. 사용자 입력 기반 리스트 구성
// 목표  : Scanner를 이용하여 사용자로부터 데이터를 입력받아 리스트를 구성하고 출력하세요.
public class InputList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        System.out.println("과일 이름을 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            fruits.add(scanner.nextLine());
        }

        fruits.forEach(System.out::println);
    }
}
