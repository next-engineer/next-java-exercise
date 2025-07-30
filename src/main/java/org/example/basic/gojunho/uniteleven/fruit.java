package org.example.basic.gojunho.uniteleven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {

        List<String> Flist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("과일을 입력하세요: ");
            Flist.add(sc.nextLine());
        }
        System.out.println(Flist);
    }
}