package org.example.basic.gojunho.unitseventeen;

public class Divide implements Calculator{
    @Override
    public int calculate(int num1, int num2) {
        try {
            return num1/num2;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (IllegalArgumentException e){
            System.out.println(e+"지원하지 않는 연산입니다.");
        }

       return 0;
    }
}
