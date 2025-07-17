package org.example.basic.leehyemin.unitthree.shopping;

//필드 및 생성자
public class Member {
    private String name;
    private String grade;
    int point;

    public Member(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }
//
//    public Shoppingmall(String name){
//        this.name = name;
//        this.grade=grade;
//        this.point=point;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void addPoint(int point) {
        this.point += point;
    }
}
