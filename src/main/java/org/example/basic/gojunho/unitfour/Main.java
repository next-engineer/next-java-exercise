package org.example.basic.gojunho.unitfour;

import java.util.*;

public class Main {
    public static void main(String args[]){
        Student student1 = new Student("두팔",0);
        Student student2 = new Student("광팔",0);
        Student student3 = new Student("공팔",0);
        Student student4 = new Student("종팔",0);
        int sum=0;
        List<Student> studentList= Arrays.asList(student1,student2,student3,student4);
        Scanner sc = new Scanner(System.in);
        for(Student class1 : studentList){
            System.out.print(class1.getName()+"이의 점수를 입력하세요: ");
            class1.setScore(sc);
            class1.getHighScore();
            sum+=class1.getScore();

        }

        Collections.sort(studentList, Comparator.comparingInt(Student::getScore).reversed());
        for (Student s : studentList) {
            System.out.println(s);
        }

        sum/= studentList.toArray().length;
        System.out.println("평균점수:"+sum);
    }
}
