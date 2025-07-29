package main.java.org.example.basic.ANheebin.unitnine;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
       if(score >= 0 && score <= 100) {
        this.score = score;
       }else{
        System.out.println("점수는 0~100 사이의 값이어야 합니다.");
       }
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 점수: " + score);
    }
}
