package org.example.basic.leeseungyeon.unitfour;

import java.util.Scanner;
import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 기본 학생 5명 생성
        Student[] students = new Student[10]; // 최대 10명까지 가능 (5명 + 입력받은 최대 5명)
        int studentCount = 5;

        students[0] = new Student("승연", 85);
        students[1] = new Student("민지", 92);
        students[2] = new Student("지현", 78);
        students[3] = new Student("영현", 96);
        students[4] = new Student("아람", 88);

        // 사용자 입력으로 학생 추가
        System.out.print("추가할 학생 수를 입력하세요: ");
        int addCount = scanner.nextInt();
        scanner.nextLine();  // 개행 제거

        for (int i = 0; i < addCount; i++) {
            System.out.print("학생 이름: ");
            String name = scanner.nextLine();
            System.out.print("학생 점수: ");
            int score = scanner.nextInt();
            scanner.nextLine();  // 개행 제거

            students[studentCount] = new Student(name, score);
            studentCount++;
        }

        // 전체 학생 출력
        System.out.println("\n== 전체 학생 목록 ==");
        for (int i = 0; i < studentCount; i++) {
            students[i].printInfo();
        }

        // 평균 점수 계산
        int total = 0;
        for (int i = 0; i < studentCount; i++) {
            total += students[i].getScore();
        }
        double average = (double) total / studentCount;
        System.out.printf("\n전체 평균 점수: %.2f\n", average);

        // 점수순 정렬
        Arrays.sort(students, 0, studentCount, (a, b) -> b.getScore() - a.getScore());

        System.out.println("\n== 점수 내림차순 정렬 ==");
        for (int i = 0; i < studentCount; i++) {
            students[i].printInfo();
        }

        // 고득점자 출력
        System.out.println("\n== 고득점자 목록 (90점 이상) ==");
        for (int i = 0; i < studentCount; i++) {
            if (students[i].isHighScore()) {
                students[i].printInfo();
            }
        }
    }
}