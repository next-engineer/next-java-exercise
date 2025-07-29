package org.example.basic.yunbyeongchang.unitnine;

public class Student {
    //var
    private final String name;      // 이름은 참조, 변경이 외부에서 없으므로 final
    private int score;              // 외부에서 setScore로 변경을 위해 final 사용 x
    private int grade;              // 점수에 따라 수치가 변경되므로 final 사용 x

    //method
    public Student(String name, int score)
    {
        this.name = name;
        setScore(score);    // 유효성 검사를 위한 setter 사용
    }

//    아래 두 getter의 경우 Student의 정보는 printInfo로 출력하고 있으므로 현재 구조에선 불러올 필요가 없음
//    public String getName()
//    {
//        return name;
//    }

//    public int getScore()
//    {
//        return score;
//    }

    private void setGrade()         // 점수 설정 시에만 변경되므로 private 처리
    {
        switch(score / 10)
        {
            case 10: this.grade = 6; break;                 // 100
            case 9: case 8: this.grade = 5; break;          // 80 ~ 99
            case 7: case 6: this.grade = 4; break;          // 60 ~ 79
            case 5: case 4: this.grade = 3; break;          // 40 ~ 59
            case 3: case 2: this.grade = 2; break;          // 20 ~ 39
            case 1: case 0: this.grade = 1; break;          // 0 ~ 19
            default:
                System.err.println("ERROR: 잘못된 정보가 있습니다.(score)");
        }
    }

    private String getGradeLevel()  // 같은 클래스 내 printInfo()에서만 사용하므로 private 처리
    {
        switch (this.grade)
        {
            case 1:     return "F";
            case 2:     return "D";
            case 3:     return "C";
            case 4:     return "B";
            case 5:     return "A";
            case 6:     return "S";
            default:
                System.err.println("ERROR: 잘못된 정보가 있습니다.(this.grade)");
                return "ERROR";

        }
    }

    public void setScore(int score)     // Main 에서 점수 수정 시도가 있으므로 public 처리
    {
        if(score >= 0 && score <= 100)  // 오류가 발생하지 않도록 수정 범위 지정
        {
            this.score = score;
            setGrade();
        }
        else
            System.err.println("ERROR: 점수는 0 ~ 100 사이여야 합니다.");
    }

    public void printInfo()
    {
        System.out.println("이름: " + name + ", 점수: " + score + ", 등급: " + getGradeLevel());
    }
}
