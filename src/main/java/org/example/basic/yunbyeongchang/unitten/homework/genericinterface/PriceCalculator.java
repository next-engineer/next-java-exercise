package org.example.basic.yunbyeongchang.unitten.homework.genericinterface;

import java.util.*;

public class PriceCalculator {
    //var

    //method
    public static <T extends Product> double calculate(List<T> list)        // 인터페이스라 하더라도 ? extends문은 변하지 않는다
    {
        double result = 0;
        for(Product product: list)
            result += product.getPrice();


        return result;
    }
}
