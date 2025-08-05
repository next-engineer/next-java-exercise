package org.example.basic.ANheebin.unitseventeen;

public class Calculator {
    //더하기기
    private static int add(int number1, int number2){
        return number1 + number2;
    }
    
    //빼기기
    private static int sub(int number1, int number2){
        return number1 - number2;
    }

    //곱하기기
    private static int mul(int number1, int number2){
        return number1 * number2;
    }

    //나눗기(0으로 나누지못하면 캐치)
    private static int div(int number1, int number2){
        try {
            return number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눗수는 없어요");
            return 0;
        }
    } //기본연산 

    private static int calculate(int number1, int number2, String operator){
        return switch (operator) {
            case "add" -> add(number1, number2);
            case "sub" -> sub(number1, number2);
            case "mul" -> mul(number1, number2);
            case "div" -> div(number1, number2);
            default -> throw new IllegalArgumentException("잘못된 연산자");
        };
    }

    public static void main(String[] args) {
        try{
            System.out.println(calculate(20, 20, "add"));
            System.out.println(calculate(30, 50, "sub"));
            System.out.println(calculate(40, 70, "mul"));
            System.out.println(calculate(10, 25, "div"));
            System.out.println(calculate(1, 10, "오류내기"));
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }


}