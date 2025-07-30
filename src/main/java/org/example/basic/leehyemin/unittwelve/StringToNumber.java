package org.example.basic.leehyemin.unittwelve;

import java.util.Scanner;

public class StringToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        String input = sc.nextLine();

        try {
            int num = Integer.parseInt(input);
            System.out.println("입력한 숫자 : "+num);
        } catch (NumberFormatException e) {
            System.out.println("유효한 숫자가 아닙니다. 숫자만 입력해주세요.");
        }
    }
}
