package org.example.basic.gojunho.unitseventeen;

public class Main {
    public static void main(String[] args){
        Calculator cal1 = new Divide();
        System.out.println(cal1.calculate(123,12));
        Calculator cal2 = new Multiply();
        System.out.println(cal2.calculate(23,12));
    }
}
