package org.example.basic.taeyeon.unitone;

 import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

    class Student {
        private String name;
        private int score;

        // 생성자
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        // 점수 출력 메서드
        public void printInfo() {
            System.out.println("이름: " + name + ", 점수: " + score);
        }

        // 90점 이상이면 이름과 점수 출력
        public void getHighScore() {
            if (score >= 90) {
                System.out.println("고득점 학생 -> 이름: " + name + ", 점수: " + score);
            }
        }

        public int getScore() {
            return score;
        }
    }

    public class student_class {
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();

            // 기본 5명 학생 생성 및 추가
            students.add(new Student("철수", 85));
            students.add(new Student("영희", 92));
            students.add(new Student("민수", 78));
            students.add(new Student("수지", 95));
            students.add(new Student("현우", 88));

            // Scanner로 학생 추가 입력 받기
            Scanner scanner = new Scanner(System.in);
            System.out.print("추가할 학생 수를 입력하세요: ");
            int additional = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            for (int i = 0; i < additional; i++) {
                System.out.print("학생 이름 입력: ");
                String name = scanner.nextLine();
                System.out.print("학생 점수 입력: ");
                int score = scanner.nextInt();
                scanner.nextLine(); // 버퍼 비우기
                students.add(new Student(name, score));
            }

            System.out.println("\n=== 모든 학생 정보 출력 ===");
            for (Student s : students) {
                s.printInfo();
            }

            // 평균 점수 계산
            double sum = 0;
            for (Student s : students) {
                sum += s.getScore();
            }
            double average = sum / students.size();
            System.out.printf("\n전체 학생 평균 점수: %.2f\n", average);

            // 90점 이상 학생 출력
            System.out.println("\n=== 90점 이상 학생 ===");
            for (Student s : students) {
                s.getHighScore();
            }

            // 점수 순 정렬 (내림차순)
            Collections.sort(students, new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    return s2.getScore() - s1.getScore();
                }
            });

            System.out.println("\n=== 점수 순 정렬 후 출력 ===");
            for (Student s : students) {
                s.printInfo();
            }

            scanner.close();
        }
    }

