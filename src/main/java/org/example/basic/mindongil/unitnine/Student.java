package org.example.basic.mindongil.unitnine;

public class Student {

    private String name;
    private int score;

    //생성자
    public Student(String name, int score) {
        this.name = name;
        setScore(score);
    }

    //이름 가져오기
    public String getName() {
        return name;
    }

    //점수 가져오기
    public int getScore() {
        return score;
    }

    //점수 설정
    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("점수는 0 ~ 100 사이여야 합니다.");
        }
    }

    //정보 출력
    public void printInfo() {
        System.out.printf("이름: %s\n점수: %d\n\n", name, score);
    }

}
