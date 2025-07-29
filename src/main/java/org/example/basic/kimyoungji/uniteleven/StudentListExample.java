package org.example.basic.kimyoungji.uniteleven;

import java.util.ArrayList;
import java.util.List;

public class StudentListExample {
    public static void main(String[] args) {
        // 학생 이름 리스트 생성
        List<String> students = new ArrayList<>();

        // 학생 추가 (5명 이상)
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");

        // 특정 학생 삭제
        students.remove("Charlie");

        // 전체 학생 목록 출력
        System.out.println("전체 학생: " + students);

        // 인덱스를 이용해 특정 학생 출력
        System.out.println("인덱스 1번 학생: " + students.get(1));
    }
}