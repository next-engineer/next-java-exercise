package org.example.basic.leeseungyeon.unittwelve.Assignment;

import java.util.Scanner;

public class InputReader implements AutoCloseable {
    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    @Override
    public void close() {
        if(scanner != null) {
            scanner.close();
        }
    }
}

//입력 처리 클래스
