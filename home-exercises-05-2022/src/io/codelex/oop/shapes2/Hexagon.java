package io.codelex.oop.shapes2;

import java.math.BigDecimal;
import java.math.MathContext;

public class Hexagon extends Shape {

    BigDecimal side;

    public Hexagon(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal calculateArea() {
        MathContext mc = new MathContext(10);
        return new BigDecimal(3).multiply(new BigDecimal(3).sqrt(mc)
                .multiply(side.pow(2, mc))).divide(new BigDecimal(2));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return side.multiply(new BigDecimal(6));
    }
}
