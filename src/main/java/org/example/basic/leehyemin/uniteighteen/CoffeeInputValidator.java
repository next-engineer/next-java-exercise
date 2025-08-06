package org.example.basic.leehyemin.uniteighteen;

public class CoffeeInputValidator {
    public static CoffeeType getCoffeeType(String input) throws InvalidInputException {
        if(input == null || input.trim().isEmpty()) {
            throw new InvalidInputException("커피 종류를 입력하지 않았습니다.");
        }

        try {
            return CoffeeType.valueOf(input.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new InvalidInputException("잘못된 커피 종류입니다: "+input);
        }
    }

    public static CoffeeSize getCoffeeSize(String input) throws InvalidInputException {
        if (input == null || input.trim().isEmpty()) {
            throw new InvalidInputException("사이즈를 입력하지 않았습니다.");
        }
        try {
            return CoffeeSize.valueOf(input.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new InvalidInputException("잘못된 사이즈입니다:"+input);
        }
    }
}
