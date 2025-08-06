package org.example.basic.mindongil.unitseventeen;

public class Main {
    public static void main(String[] args) {

        Calculator calculatorAdd = new Add();
        System.out.println(calculatorAdd.calculate(3,4));

        Calculator calculatorSub = new Subtraction();
        System.out.println(calculatorSub.calculate(3,4));

        Calculator calculatorMultError = new Multiplication();
        System.out.println(calculatorMultError.calculate(3,0));

        Calculator calculatorMult = new Multiplication();
        System.out.println(calculatorMult.calculate(126,7));

        Calculator calculatorDiv = new Division();
        System.out.println(calculatorDiv.calculate(3,4));
    }
}
