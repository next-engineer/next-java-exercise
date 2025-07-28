package org.example.basic.yunbyeongchang.unittwelve.homework.dividenum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerNumber {
    //var
    private final Scanner sc;

    //method
    public ScannerNumber(Scanner sc) {
        this.sc = sc;
    }

    public int inputNumber() throws InputMismatchException {
        return sc.nextInt();    //문자가 입력되면 예외 발생
    }

    public void clearBuffer() {     //잘못된 입력이 들어왔을 때 버퍼 제거
        if(sc.hasNextLine())
            sc.nextLine();
    }

}
