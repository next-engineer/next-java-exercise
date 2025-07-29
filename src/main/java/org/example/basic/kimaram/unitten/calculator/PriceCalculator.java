package org.example.basic.kimaram.unitten.calculator;

import java.util.List;

// 4. 제네릭 + 인터페이스 활용 : 제네릭 타입에 인터페이스를 적용하여 여러 타입을 동일한 방식으로 처리
public class PriceCalculator {
    public static <T extends Product> double calculateTotal(List<T> list) {
        double total = 0;
        for (T item : list) {
            total += item.getPrice();
        }
        return total;
    }
}
