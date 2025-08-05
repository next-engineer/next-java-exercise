package org.example.basic.sangyoonlee.unitfourteen.sangyoonannotation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput input = new UserInput();

        System.out.print("과일 이름을 입력하세요 (사과, 바나나, 오렌지): ");
        String userInput = scanner.nextLine();
        input.setFruit(userInput);

        boolean isValid = AllowedWordsValidator.validate(input);
        if (isValid) {
            System.out.println("유효한 입력입니다!");
        }
    }
}
