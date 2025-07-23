package org.example.basic.yunbyeongchang.unitnine;

public class Student {
    //var
    private String name;
    private int score;

    //method
    public Student(String name, int score)
    {
        this.name = name;
        setScore(score);    // 유효성 검사를 위한 setter 사용
    }

    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        if(score >= 0 && score <= 100)  // 오류가 발생하지 않도록 수정 범위 지정
        {
            this.score = score;
        }
        else
            System.out.println("점수는 0 ~ 100 사이여야 합니다.");
    }

    public void printInfo()
    {
        System.out.println("이름: " + name + ", 점수: " + score);
    }
}
