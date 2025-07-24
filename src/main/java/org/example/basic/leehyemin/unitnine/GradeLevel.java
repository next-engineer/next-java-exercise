package org.example.basic.leehyemin.unitnine;

public class GradeLevel {
    public static String getGradeLevel(int score) {
        switch (score/10) {
            case 9: case 10:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";

        }
    }
}
