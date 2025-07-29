package org.example.basic.sangyoonlee.uniteight.shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Shape {
    private final BigDecimal width;
    private final BigDecimal height;

    public Rectangle(double width, double height) {
        this.width = BigDecimal.valueOf(width).setScale(17, RoundingMode.HALF_DOWN);
        this.height = BigDecimal.valueOf(height).setScale(17, RoundingMode.HALF_DOWN);
    }

    @Override
    public String area() {
        return width.multiply(height)
                .setScale(17, RoundingMode.HALF_DOWN)
                .stripTrailingZeros()
                .toPlainString();
    }
}
