package org.example.basic.kimyoungji.unitfour;

public class Student {
    private String name;
    private int score;

    // 생성자
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 점수 출력
    public void printInfo() {
        System.out.println("이름: " + name + ", 점수: " + score);
    }

    // 고득점 여부 반환
    public boolean isHighScore() {
        return score >= 90;
    }

    // Getter
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

}
