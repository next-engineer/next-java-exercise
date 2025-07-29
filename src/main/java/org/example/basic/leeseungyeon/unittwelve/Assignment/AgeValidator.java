package org.example.basic.leeseungyeon.unittwelve.Assignment;

public class AgeValidator {
    public void validate(int age) throws AgeException {
        if(age < 19) {
            throw new AgeException("19세 미만은 접근할 수 없습니다.");
        }
    }
}

//나이검증 클래스