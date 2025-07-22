package org.example.basic.kimyoungji.unitfour;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // 기본 학생 5명 추가
        students.add(new Student("김철수", 85));
        students.add(new Student("이영희", 92));
        students.add(new Student("박지민", 77));
        students.add(new Student("최유나", 98));
        students.add(new Student("정우성", 66));

        // (optional) 사용자 입력으로 학생 추가
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생을 추가하시겠습니까? (Y/N)");
        String input = scanner.nextLine();

        while (input.equalsIgnoreCase("Y")) {
            System.out.print("학생 이름 입력: ");
            String name = scanner.nextLine();

            System.out.print("점수 입력: ");
            int score = scanner.nextInt();
            scanner.nextLine(); // 버퍼 제거

            students.add(new Student(name, score));

            System.out.println("계속 추가하시겠습니까? (Y/N)");
            input = scanner.nextLine();
        }

        // 모든 학생 정보 출력
        System.out.println("\n 전체 학생 목록:");
        for (Student s : students) {
            s.printInfo();
        }

        // 평균 점수 계산
        int total = 0;
        for (Student s : students) {
            total += s.getScore();
        }
        double avg = (double) total / students.size();
        System.out.println("\n 전체 평균 점수: " + avg);

        // 90점 이상 학생 출력
        System.out.println("\n 90점 이상 학생:");
        for (Student s : students) {
            if (s.isHighScore()) {
                s.printInfo();
            }
        }

        // 점수 순 정렬 (내림차순)
        students.sort((a, b) -> b.getScore() - a.getScore());

        System.out.println("\n 점수 순 정렬 결과:");
        for (Student s : students) {
            s.printInfo();
        }
    }
}
