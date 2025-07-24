package org.example.basic.sangyoonlee.unitten.product;

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
