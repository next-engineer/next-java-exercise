package org.example.basic.taebinlee.unitfour;

// 라이브러리 불러오기
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 학생 리스트
        ArrayList<Student> students = new ArrayList<>();


        // 학생 5명 이상 생성
        students.add(new Student("이태빈", 85));
        students.add(new Student("김동영", 92));
        students.add(new Student("이희근", 77));
        students.add(new Student("김태현", 95));
        students.add(new Student("오동현", 88));


        // 학생의 모든 정보 출력
        System.out.println("\n 학생들의 모든 정보 출력: ");
        for (Student i : students) {
            i.printInfo();
            System.out.println("-------------");
        }

        // 학생들의 평균 점수 계산
        int total = 0;
        for (Student i : students) {
            total += i.getScore();
        }
        double average = (double) total /students.size();
        System.out.println("\n 전체 학생 평균 점수 : "+ average);


        // 90점 이상 고득점자 학생만 출력
        System.out.println("\n 90점 이상 고득점자:");
        for (Student i : students) {
            i.checkHighScore();
        }


        // 점수 기준으로 정렬 후 출력 (Chat gpt 참고)
        students.sort(Comparator.comparing(Student::getScore).reversed()); // 내림차순 정렬
        System.out.println("\n 점수 기준 정렬 결과:");
        for (Student s : students) {
            s.printInfo();
        }


        // 사용자로부터 학생 입력받기 (Chat gpt 참고)
        Scanner sc = new Scanner(System.in);
        System.out.print("\n새 학생 이름 입력: ");
        String newName = sc.nextLine();
        System.out.print("새 학생 점수 입력: ");
        int newScore = sc.nextInt();

        Student newStudent = new Student(newName, newScore);
        students.add(newStudent);
        System.out.println("학생이 추가되었습니다!");


        // 추가된 학생까지 포함된 리스트 다시 출력
        System.out.println("\n 전체 학생 목록 출력: ");
        for (Student i : students) {
            i.printInfo();
        }

    }
}
