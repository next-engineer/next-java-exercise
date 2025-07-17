package org.example.basic.sangyoonlee.unitfour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentProcessor {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(List.of(
                new Student("student1", 91),
                new Student("student2", 88),
                new Student("student3", 95),
                new Student("student4", 79),
                new Student("student5", 84),
                new Student("student6", 91),
                new Student("student7", 88),
                new Student("student8", 95),
                new Student("student9", 79),
                new Student("student10", 84)
        ));

        Scanner scanner = new Scanner(System.in);

        mainInput(scanner, studentList);
    }

    private static void mainInput(Scanner scanner, List<Student> studentList) {
        while (true) {
            try {
                System.out.println("==선택==");
                System.out.println("1.전체 학생 성적 조회");
                System.out.println("2.상위권 학생 성적 조회");
                System.out.println("3. 학생추가");
                System.out.println("0.종료");
                int value = Integer.parseInt(scanner.nextLine());
                boolean result = mainInputSelector(scanner, value, studentList);
                if(result){
                    scanner.close();
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("숫자만 입력해주세요");
                System.out.println();
            }
        }
    }

    private static boolean mainInputSelector(Scanner scanner, int value, List<Student> studentList) {
        return switch (value) {
            case 1 -> {
                System.out.println();
                printStudentsInfo(studentList);
                yield false;
            }
            case 2 -> {
                System.out.println();
                printHighScoreStudentsInfo(studentList);
                yield false;
            }
            case 3 -> {
                addStudent(scanner, studentList);
                yield false;
            }
            case 0 -> true;
            default -> {
                System.out.println();
                System.out.println("옳바른 숫자를 입력해주세요");
                System.out.println();
                yield false;
            }
        };
    }

    private static void addStudent(Scanner scanner, List<Student> studentList) {
        while(true) {
            System.out.println();
            try {
                System.out.println("학생 이름을 입력하세요");
                String name = scanner.nextLine();
                System.out.println();
                System.out.println("점수를 입력하세요");
                int score = Integer.parseInt(scanner.nextLine());
                studentList.add(new Student(name, score));
                System.out.println();
                break;
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("숫자만 입력해주세요");
                System.out.println();
            }

        }
    }

    private static void printStudentsInfo(List<Student> studentList) {
        System.out.println("==전체 학생==");
        for (Student student : studentList) {
            student.printInfo();
        }
        System.out.println();
    }

    private static void printHighScoreStudentsInfo(List<Student> studentList) {
        System.out.println("==상위권 학생==");
        for (Student student : studentList) {
            student.printIfHighScore();
        }
        System.out.println();
    }
}