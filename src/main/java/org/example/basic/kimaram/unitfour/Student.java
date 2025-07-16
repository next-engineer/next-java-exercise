package org.example.basic.kimaram.unitfour;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 점수 출력 메서드
    public void printInfo() {
        System.out.printf("%s의 점수 : %d%n", this.name, this.score);
    }

    // 90점이상 출력하는 메서드
    public void getHighScore() {
        if(score >= 90) {
            this.printInfo();
        }
    }

    //getter
    public int getScore() {
        return score;
    }

}
