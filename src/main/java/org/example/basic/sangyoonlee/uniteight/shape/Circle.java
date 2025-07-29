package org.example.basic.sangyoonlee.uniteight.shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {

    private final BigDecimal radius;

    public Circle(double radius) {
        this.radius = BigDecimal.valueOf(radius).setScale(17, RoundingMode.HALF_DOWN);
    }

    @Override
    public String area() {
        return (radius.pow(2))
                .multiply(BigDecimal.valueOf(Math.PI))
                .setScale(17, RoundingMode.HALF_DOWN)
                .stripTrailingZeros()
                .toPlainString();
    }
}
