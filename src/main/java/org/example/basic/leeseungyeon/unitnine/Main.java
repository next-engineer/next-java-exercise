package main.java.org.example.basic.leeseungyeon.unitnine;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("신짱구", 85);
        s1.printInfo();  // 이름: 신짱구, 점수: 85

        // 점수 변경
        s1.setScore(95);
        s1.printInfo();  // 이름: 홍길동, 점수: 95

        // 잘못된 점수 입력
        s1.setScore(150);  // 경고 출력

        // 직접 접근 시도 (컴파일 오류)
        // s1.score = 50;  // 에러: score는 private 접근 불가
    }
}