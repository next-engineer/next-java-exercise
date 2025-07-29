package org.example.basic.yunbyeongchang.unittwelve.homework.dividenum;

import java.util.OptionalInt;

public class Divider {
    //var

    //method
    public static OptionalInt divideNum(int num1, int num2)
    {
        try {
            return OptionalInt.of(num1 / num2);
        } catch(ArithmeticException e) {                        // 0으로 나눴을 때
            System.out.println("0으로는 나눌 수 없습니다.");
            return OptionalInt.empty();                           //강제 종료
        }
    }

}
