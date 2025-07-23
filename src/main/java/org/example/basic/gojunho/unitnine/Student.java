package org.example.basic.gojunho.unitnine;

public class Student {
    private String name;
    private int score;
    private String grade;

    public Student(String name,int score){
        this.name= name;
        if(score>=1 && score<=6){
            this.score=score;
        }
        else{
            System.out.println("점수는 0 ~ 100 사이여야 합니다.");
        }
    }

    public String getName(){
        return name;
    }

    public int getScore() {
        return score;
    }

    public void getGradeLevel(){
        if(score>=5 && score<=6 ){
            grade="A";
        }
        else if(score>=3 && score<=4){
            grade="B";
        }
        else if(score>=1 && score<=2){
            grade="C";
        }

    }

    public void printInfo(){
        System.out.println("이름: "+ name +", 점수: " + score+", 등급:"+ grade);
    }
}
