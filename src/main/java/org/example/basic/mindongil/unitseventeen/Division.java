package org.example.basic.mindongil.unitseventeen;

public class Division implements Calculator{
    @Override
    public int calculate(int numA, int numB) {
        try {
            return numA / numB;
        }  catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }   catch (IllegalArgumentException e) {
            System.out.println(e+"지원하지 않는 연산입니다.");
        }
        return 0;
    }
}
