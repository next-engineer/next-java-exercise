package org.example.basic.leeseungyeon.unittwelve.Assignment;

public class App {
    public static void main(String[] args) {
        try (InputReader inputReader = new InputReader()) {
            NumberParser parser = new NumberParser();
            Divider divider = new Divider();
            AgeValidator ageValidator = new AgeValidator();

            // 1) 숫자 두 개 입력받아 나누기
            try {
                int num1 = parser.parseInt(inputReader.readLine("첫 번째 숫자 입력: "));
                int num2 = parser.parseInt(inputReader.readLine("두 번째 숫자 입력: "));
                System.out.println("나누기 결과: " + divider.divide(num1, num2));
            } catch (NumberFormatException e) {
                System.out.println("숫자 형식이 올바르지 않습니다.");
            } catch (ArithmeticException e) {
                System.out.println("에러: " + e.getMessage());
            }

            // 2) 나이 입력받아 검증
            try {
                int age = parser.parseInt(inputReader.readLine("나이 입력: "));
                ageValidator.validate(age);
                System.out.println("나이 검증 통과");
            } catch (NumberFormatException e) {
                System.out.println("나이는 숫자로 입력해야 합니다.");
            } catch (AgeException e) {
                System.out.println("에러: " + e.getMessage());
            }
        }
    }
}

//실행 및 흐름 제어 클래스