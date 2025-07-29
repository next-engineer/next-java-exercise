package org.example.basic.kimyoungji.unitten.genericinterfaceuse;

import java.util.List;

public class PriceCalculator {
    public static <T extends Product> double calculateTotal(List<T> list) {
        double total = 0;
        for (T item : list) {
            total += item.getPrice();
        }
        return total;
    }
}
