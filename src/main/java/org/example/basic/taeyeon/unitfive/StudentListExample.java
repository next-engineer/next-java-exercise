package org.example.basic.taeyeon.unitfive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentListExample {

    public static void main(String[] args) {
        // 초기 학생 목록 입력
        List<String> students = new ArrayList<>(Arrays.asList(
                "Alice", "Bob", "Charlie", "David", "Eve"
        ));

        // Charlie 삭제
        students.remove("Charlie");

        // 전체 학생 출력
        System.out.println("전체 학생: " + students);

        // 인덱스 1번 학생 출력
        if (students.size() > 1) {
            System.out.println("인덱스 1번 학생: " + students.get(1));
        } else {
            System.out.println("인덱스 1번 학생이 존재하지 않습니다.");
        }
    }
}
