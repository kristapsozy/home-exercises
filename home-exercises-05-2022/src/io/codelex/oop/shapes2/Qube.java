package io.codelex.oop.shapes2;

import java.math.BigDecimal;
import java.math.MathContext;

public class Qube extends Shape3D {

    BigDecimal side;

    public Qube(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal calculateArea() {
        return new BigDecimal(6).multiply(side.pow(2, new MathContext(10)));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return side.multiply(new BigDecimal(12));
    }

    @Override
    public BigDecimal calculateVolume() {
        return side.pow(3, new MathContext(10));
    }
}
