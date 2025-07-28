package org.example.basic.yunbyeongchang.unittwelve.homework.agecheck;

public class CheckAge {
    //var
    private static final int UNDERAGE = 19;

    //method
    public static void checkAge(int age) throws AgeException {
        if(age < UNDERAGE)
            throw new AgeException("미성년자는 접근하실 수 없습니다.");
    }
}
