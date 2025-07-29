package org.example.basic.leehyemin.unitnine;

public class Student {
    private String name;
    private int score;
    private int grade;

    public Student() {}

    public Student(String name, int score, int grade) {
        this.name = name;
        updateScore(score);
        updateGrade(grade);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getGrade() {
        return grade;
    }

    public void updateScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("점수는 0 ~ 100 사이여야 합니다.");
        }

    }

    public void updateGrade(int grade) {
        if(grade >=1 && grade <= 6){
            this.grade = grade;
        } else {
            System.out.println("학년은 1~6학년만 있습니다.");
        }
    }

    public void printInfo() {
        if(score < 0 || score > 100){
            System.out.println("점수는 0~100 사이여야 합니다. 수정해주세요.");
            return;
        }

        if(grade < 1 || grade > 6){
            System.out.println("학년은 1~6학년만 있습니다. 수정해주세요.");
            return;
        }

        System.out.println("이름 : "+name+"("+grade+"학년)");
        System.out.println("점수 : "+score);
        System.out.println("등급 : "+GradeLevel.getGradeLevel(score));
        System.out.println();
    }


}
