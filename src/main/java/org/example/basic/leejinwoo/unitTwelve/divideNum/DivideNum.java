package org.example.basic.leejinwoo.unitTwelve.divideNum;

import org.example.basic.leejinwoo.unitTwelve.MyException;

public class DivideNum {

    private int num1;
    private int num2;

    public DivideNum(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void checkNum() throws MyException {
        if(num1 == 0 || num2 == 0){
            throw new MyException("0으로 나눌수 없습니다.");
        }
    }

    public void divideNum(){
        try {
            checkNum();
            System.out.println(num1 / num2);
        }catch (Exception e){
            System.out.println("err : " + e.getMessage());
        }
    }
}
