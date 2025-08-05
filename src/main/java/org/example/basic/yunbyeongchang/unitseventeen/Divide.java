package org.example.basic.yunbyeongchang.unitseventeen;

public class Divide implements Operation{
    //var

    //method
    public int operation(int num1, int num2) {
        checkDivideZero(num2);
        return num1 / num2;
    }

    private void checkDivideZero(int num) {
        if(num == 0) {
            throw new DivideByZeroException("0으로는 나눌 수 없습니다.");
        }
    }

}
