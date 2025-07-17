package org.example.basic.parkgwanghoon.UnitFour;

import java.util.Scanner;

public class StudentInput {

    public static Student inputInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("학번 입력: ");
        int studentNumber = sc.nextInt();

        System.out.print("이름 입력: ");
        String name = sc.nextLine();

        System.out.print("점수 입력: ");
        int score = sc.nextInt();

        return new Student(studentNumber, name, score);
    }
}