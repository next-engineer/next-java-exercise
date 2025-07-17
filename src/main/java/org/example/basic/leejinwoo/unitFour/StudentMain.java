package org.example.basic.leejinwoo.unitFour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        ArrayList<Student> students = addStudent();
        System.out.println("students : " + students.size());
        getHighScore(students);
        averageScore(students);

        studentSort(students);
    }

    public static ArrayList<Student> addStudent(){  //학생 추가
        ArrayList<Student> students = new ArrayList<>();

        String stop = "Y";

        while ("Y".equalsIgnoreCase(stop)){
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.print("학생 이름을 입력해주세요 : ");
                String name = scanner.nextLine();

                System.out.print("점수를 입력해주세요 : ");
                int score = scanner.nextInt();

                Student student = new Student(name, score);
                students.add(student);

                Scanner stopScanner = new Scanner(System.in);
                System.out.print("계속 입력하시겠습니까? (Y/N) : ");
                stop = stopScanner.nextLine();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return students;
    }

    public static void averageScore(ArrayList<Student> students){
        int scoreSum = 0;
        int averageScore = 0;

        for(Student list : students){
            scoreSum = scoreSum + list.getScore();
        }
        averageScore = scoreSum / students.size();
        System.out.println("평균 값 : " + averageScore);
    }

    public static void getHighScore(ArrayList<Student> students){
        for(Student list : students){
            list.getHighScore();
        }
    }

    public static void studentSort(ArrayList<Student> students){    //점수순 정렬
        students.sort(new studentComparator());

        for(Student list : students){
            list.printInfo();
        }
    }

    static class studentComparator implements Comparator<Student>{  //점수순 정렬 로직

        @Override
        public int compare(Student a, Student b) {
            return Integer.compare(b.getScore(), a.getScore());
        }
    }
}
