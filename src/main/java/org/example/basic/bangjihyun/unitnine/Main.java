package org.example.basic.bangjihyun.unitnine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 학생 객체 생성
        Student s1 = new Student("뿡뿡이" , 85, 3);
        Student s2 = new Student("방타미", 92, 2);
        Student s3 = new Student("빵진이",76, 1);
        Student s4 = new Student("빵빵이", 59, 4);

        // 학생 리스트에 담기
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        // 전체 학생 정보 출력
        for (Student s : students) {
            s.printInfo(); // 이름: 뿡뿡이, 점수:85
        }

        // 점수 변경
        s1.setScore(95);
        s1.printInfo(); // 이름: 뿡뿡이, 점수:95

        // 잘못된 점수 입력
        s1.setScore(150); // 경고 출력

        // 직접 접근 시도 (컴파일 오류)
        // s1.score = 50; // 에러: score는 private 접근 불가
    }
}
