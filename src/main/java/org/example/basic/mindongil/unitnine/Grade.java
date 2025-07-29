package org.example.basic.mindongil.unitnine;

public class Grade {

    private String name;
    private int score;
    private String grade = "";

    Grade(String name, int score) {
        this.name = name;
        setScore(score);
        getGradeLevel(score);
    }

    //등급 설정
    public void setScore(int score) {
        if (score >= 1 && score <= 6) {
            this.score = score;
        } else {
            System.out.println("점수는 1 ~ 6 사이여야 합니다.");
        }
    }

    //점수에 따라 등급 반환
    public String getGradeLevel(int score) {
        if (score == 1 || score == 2) {
            grade = "A";
        }
        else if (score == 3 || score == 4) {
            grade = "B";
        }
        else if (score == 5 || score == 6) {
            grade = "C";
        }
        else{
            grade = "점수 오류.";
        }

        return grade;
    }

    //정보 출력
    public void printInfo() {
        System.out.printf("이름: %s\n등급: %s\n\n",  name, grade);
    }

}
