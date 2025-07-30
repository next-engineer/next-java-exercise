package org.example.basic.yunbyeongchang.unittwelve.homework.dividenum;

import java.util.InputMismatchException;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    //var
    private static final int INPUT_COUNT = 2;

    //method
    public static void main(String[] args) {
        int[] numbers;

        try(Scanner scanner = new Scanner(System.in)) {
            ScannerNumber scannerNumber = new ScannerNumber(scanner);
            numbers = readNumbers(scannerNumber);
        }

        printResult(numbers);

    }

    public static int[] readNumbers(ScannerNumber scannerNumber)
    {
        int[] var = new int[INPUT_COUNT];
        int count = 0;

        while(count < INPUT_COUNT) {
            OptionalInt input = promptInputNumber(scannerNumber);          //null값 확인을 위한 타입
            if(input.isPresent()) {
                var[count++] = input.getAsInt();                      //배열에 값 기입
            }
        }

        return var;
    }

    public static void printResult(int[] numbers)
    {
        OptionalInt result = Divider.divideNum(numbers[0], numbers[1]);
        if(result.isPresent())
            System.out.println(numbers[0] + " / " + numbers[1] + ": " + result.getAsInt());
    }

    public static OptionalInt promptInputNumber(ScannerNumber scannerNumber)
    {
        System.out.println("숫자를 입력하세요.");

        try {
            return OptionalInt.of(scannerNumber.inputNumber());
        } catch(InputMismatchException e) {                                    //잘못된 값 입력 시
            System.out.println("잘못된 입력입니다. 다시 입력해 주세요");            //에러 메시지 출력
            scannerNumber.clearBuffer();                                     //입력된 값 버퍼 제거
            return OptionalInt.empty();                                     //에러 신호 출력
        }
    }
}
