package org.example.basic.mindongil.unitfour;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentLists = new ArrayList<>();

        studentLists.add(new Student("동일", 100));
        studentLists.add(new Student("짱구", 95));
        studentLists.add(new Student("철수", 90));
        studentLists.add(new Student("유리", 85));
        studentLists.add(new Student("맹구", 80));

        //학생 추가
        System.out.print("추가할 학생 수: ");
        int count = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; i++){
            System.out.print((i+1) + "번째 학생 이름: ");
            String name = sc.nextLine();

            System.out.print(name + "의 점수: ");
            int score = sc.nextInt();
            sc.nextLine();

            studentLists.add(new Student(name, score));
        }

        //학생 정보 출력
        System.out.println("\n 학생들 정보.");
        for(Student student : studentLists){
            student.printStudentInfo();
        }

        double avg = 0;
        for(Student student : studentLists){
            student.getStudentScore();
            avg = avg + student.getStudentScore();
        }
        avg = avg / studentLists.size();
        System.out.printf("평균 점수: %.2f\n", avg);

        //고득점자
        for(Student student : studentLists){
            student.getHighScore();
        }


    }

}
