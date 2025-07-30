package org.example.basic.parkgwanghoon.UnitEleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentListExample {
    public static void main(String[] args) {
        // 1. 학생 이름 5명 이상 추가
        List<String> students = new ArrayList<>();
        Collections.addAll(students, "Alice", "Bob", "Charlie", "David", "Eve");

        // 2. 특정 학생 이름 삭제 (Charlie 삭제)
        students.remove("Charlie");

        // 3. 인덱스를 이용해 특정 학생 이름 출력 (1번 인덱스)
        System.out.println("인덱스 1번 학생: " + students.get(1));

        // 4. 전체 학생 목록 출력
        System.out.println("전체 학생 목록: " + students);
    }
}
