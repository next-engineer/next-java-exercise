package org.example.basic.leejinwoo.unitTwelve.divideNum;

import org.example.basic.leejinwoo.unitTwelve.MyException;

import java.util.Scanner;

public class DivideNumMain {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("num1 : ");
        int num1 = insertNum();
        System.out.println("num2 : ");
        int num2 = insertNum();

        DivideNum divideNum = new DivideNum(num1, num2);

        divideNum.divideNum();
    }

    public static int insertNum(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        }catch (Exception e){
            System.out.println("err : " + e.getMessage());
        }
        return 0;
    }
}
