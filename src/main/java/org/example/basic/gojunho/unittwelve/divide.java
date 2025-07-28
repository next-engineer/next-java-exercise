package org.example.basic.gojunho.unittwelve;

import java.util.Scanner;

public class divide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quotient = sc.nextInt();
        int remainder = sc.nextInt();
        try {
            int result = quotient/remainder;
        }catch (ArithmeticException e){
            System.out.println("예외발생: "+e.getMessage());
        }finally {
            System.exit(0);
        }
    }
}
