package org.example.basic.kimaram.unitfour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("가영이", 56));
        students.add(new Student("나영이", 87));
        students.add(new Student("다영이", 92));
        students.add(new Student("라영이", 25));
        students.add(new Student("마영이", 100));

        // 사용자 입력으로 학생, 학생 점수 추가하기
        addStudents(students);

        System.out.println("[모든 학생 정보]");
        for (Student student: students) {
            student.printInfo();
        }
        bar();

        // 모든 학생들의 평균 점수 출력
        System.out.println("[모든 학생들의 평균 점수]");
        averageScore(students);

        // 90점 이상의 학생 출력
        System.out.println("[90점 이상의 학생 출력]");
        for (Student student: students) {
            student.getHighScore();
        }
        bar();

        System.out.println("[학생들의 점수를 내림차순으로 정렬해서 출력]");
        sortScore(students);


    }

    // 모든 학생들의 평균 점수 출력 메서드
    public static void averageScore(ArrayList<Student> students) {
        int scoreSum = 0;
        for (Student student: students) {
            scoreSum += student.getScore();
        }
        int averageScore = scoreSum / students.size();
        System.out.println(averageScore);
        bar();
    }

    // 점수 순서대로 출력 메서드 (내림차순)
    public static void sortScore(ArrayList<Student> students) {
        // sort 위한 student 리스트 복제
        ArrayList<Student> sortStudent = new ArrayList<>(students);
        Collections.sort(sortStudent, ((o1, o2) -> o2.getScore() - o1.getScore()));

        for (Student student: sortStudent) {
            student.printInfo();
        }
        bar();
    }

    // 학생 정보 입력받기
    public static void addStudents(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);

        System.out.println("학생의 이름을 입력해 주세요.");
        String name = sc.nextLine();

        System.out.println("학생의 점수를 입력해 주세요.");
        int score = sc.nextInt();

        // students에 추가
        students.add(new Student(name, score));

    }

    public static void bar() {
        System.out.println("============================");
    }
}
