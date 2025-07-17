package org.example.basic.ANheebin.onepROJECT.unittfour;

import java.util.ArrayList;
import java.util.Collections;

public class studentmain {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("홍길동", 85));
        students.add(new Student("김철수", 75));
        students.add(new Student("이영희", 95));
        students.add(new Student("최자영", 95));
        students.add(new Student("박민수", 88));

        System.out.println("모든 학생 정보 출력");
        System.out.println("--------------------------------");
        int totalScore = 0;

        for(Student student : students){
            student.printlnfo();
        } //향상된 for문으로 학생 정보 출력

        double avg=(double)totalScore/students.size();
        System.out.println("학생생 : " + students.size());
        System.out.println("평균 점수 : " + avg);

        System.out.println("\n=== 90점 이상 학생 ===");
        for (Student s : students) {
            if (s.gethighScore()) {
                s.printlnfo();  // 향상된 for문 사용
            }
        }

        System.out.println("\n=== 점수 높은 순 정렬 ===");
        Collections.sort(students, (a, b) -> b.getscore() - a.getscore());
        for (Student s : students) {
            s.printlnfo();  // 향상된 for문 사용
        }

    }
}
