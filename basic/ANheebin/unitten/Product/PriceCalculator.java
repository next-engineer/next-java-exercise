package main.java.org.example.basic.ANheebin.unitten.Product;

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