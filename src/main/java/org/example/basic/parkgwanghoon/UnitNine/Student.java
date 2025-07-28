package org.example.basic.parkgwanghoon.UnitNine;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        if (grade >= 1 && grade <= 6) {
            this.grade = grade;
        } else {
            System.out.println("⚠️ 기재오류");
        }
    }

    public int getGrade() {
        return grade;
    }
    public String getGradeLevel() {
        return switch (grade) {
            case 1 -> "A";
            case 2 -> "B";
            case 3 -> "C";
            case 4 -> "D";
            case 5 -> "E";
            case 6 -> "F";
            default -> "Invalid";
        };
    }

    public void printInfo() {
        System.out.printf("이름" + name + "// 등급: " + grade + "// 성적: " + getGradeLevel() + "\n");
    }
}