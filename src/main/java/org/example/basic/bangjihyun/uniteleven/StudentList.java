package org.example.basic.bangjihyun.uniteleven;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        // 학생 이름 추가
        students.add("뿡뿡이");
        students.add("빵진이");
        students.add("타미");
        students.add("짜잔형");
        students.add("깔깔마녀");

        // 깔깔마녀 삭제
        students.remove("깔깔마녀");

        // 전체 학생 출력
        System.out.println("전체 학생: " + students);

        // 인덱스 1번 학생 출력
        System.out.println("인덱스 1번 학생: " +students.get(1));

    }
}
