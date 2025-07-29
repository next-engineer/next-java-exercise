package org.example.basic.leehyemin.unitfour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student student1=new Student("홍길동", 100);
//        Student student2=new Student("장길산", 20);
//        Student student3=new Student("이순신", 95);
//        Student student4=new Student("안중근", 85);
//        Student student5=new Student("이방원", 90);

        //List<Student> studentList=new ArrayList<Student>();
//        Student[] s={student1,student2,student3,student4,student5};
//
//        for(Student student : s){
//            studentList.add(student);
//        }
        Scanner sc=new Scanner(System.in);
        List<Student> studentList=new ArrayList<Student>();

        System.out.println("입력할 학생 수를 입력하세요 : ");
        int count=sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=count; i++){
            System.out.println(i+"번째 학생 이름 : ");
            String name=sc.nextLine();

            System.out.println(i+"번째 학생 점수 : ");
            int score=sc.nextInt();
            sc.nextLine();

            Student student=new Student(name,score);
            studentList.add(student);
        }

        //학생 정보 출력
        PrintScore print=new PrintScore();
        print.printInfo(studentList);

        //평균 점수 출력
        AvgScore avg=new AvgScore();
        avg.avgScore(studentList);

        //90점 이상만 출력
        print.getHighScore(studentList);

        //점수 순으로 정렬
        StudentSort studentSort=new StudentSort();
        studentSort.studentSortByScore(studentList);
    }
}
