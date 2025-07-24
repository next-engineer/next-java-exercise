package org.example.basic.kimyoungji.unitnine.exercise;

public class Student {
    private String name;       // 공개할 필요 없음: 캡슐화
    private int score;         // 점수도 직접 접근 못하도록 숨김

    // 생성자
    public Student(String name, int score) {
        this.name = name;
        setScore(score);  // 유효성 검사를 포함한 setter 사용
    }

    // Getter (읽기)
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // Setter (쓰기) - 점수 유효성 검사 포함
    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("점수는 0 ~ 100 사이여야 합니다.");
        }
    }

    // 정보 출력
    public void printInfo() {
        System.out.println("이름: " + name + ", 점수: " + score);
    }
}
