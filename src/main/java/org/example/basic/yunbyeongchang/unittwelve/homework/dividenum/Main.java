package org.example.basic.yunbyeongchang.unittwelve.homework.dividenum;

import java.util.InputMismatchException;
import java.util.OptionalInt;

public class Main {
    //var
    private static final int INPUT_COUNT = 2;

    //method
    public static void main(String[] args) {
        ScannerNumber scannerNumber = new ScannerNumber();
        int[] numbers = new int[INPUT_COUNT];
        int count = 0;

        while(count < INPUT_COUNT) {
            OptionalInt input = promptInputNumber(scannerNumber);          //null값 확인을 위한 타입
            if(input.isPresent()) {
                numbers[count++] = input.getAsInt();                      //배열에 값 기입
            }
        }

        printResult(numbers);

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
