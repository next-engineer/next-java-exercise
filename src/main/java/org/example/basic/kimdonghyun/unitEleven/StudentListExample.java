package org.example.basic.kimdonghyun.unitEleven;
import java.util.ArrayList;
import java.util.List;

public class StudentListExample {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        // 1. 학생 이름 5명 추가
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");

        // 2. 특정 학생 이름 삭제
        students.remove("Charlie");

        // 3. 인덱스로 이름 출력 (예: 1번 인덱스)
        System.out.println("인덱스 1번 학생: " + students.get(1));

        // 4. 전체 학생 목록 출력
        System.out.println("전체 학생 목록: " + students);
    }
}