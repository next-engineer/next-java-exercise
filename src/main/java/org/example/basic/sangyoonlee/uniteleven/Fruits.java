package org.example.basic.sangyoonlee.uniteleven;

import java.util.*;

public class Fruits {

    private static void addFruitList(List<String> list, String value) {
        list.add(value);
    }

    private static void printFruitInfo(List<String> list) {
        System.out.println("과일목록: " + list);
    }

    private static void scannerUtil(Scanner scanner, List<String> list) {
        while (true) {
            if (list.size() < 5) {
                String fruit = scanner.nextLine();
                addFruitList(list, fruit);
            } else {
                printFruitInfo(list);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fruits = new LinkedList<>();

        System.out.println("과일명 5개를 입력해주세요");
        scannerUtil(scanner, fruits);
    }
}
