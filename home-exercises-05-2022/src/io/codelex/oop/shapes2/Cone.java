package io.codelex.oop.shapes2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Cone extends Shape3D {

    BigDecimal radius;
    BigDecimal height;
    BigDecimal lengthOfSlant;

    public Cone(BigDecimal radius, BigDecimal height, BigDecimal lengthOfSlant) {
        this.radius = radius;
        this.height = height;
        this.lengthOfSlant = lengthOfSlant;
    }

    @Override
    public BigDecimal calculateArea() {
        return new BigDecimal(Math.PI).multiply(radius).multiply(lengthOfSlant)
                .add(new BigDecimal(Math.PI).multiply(radius.pow(2, new MathContext(10))));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return new BigDecimal(2).multiply(new BigDecimal(Math.PI)).multiply(radius);
    }

    @Override
    public BigDecimal calculateVolume() {
        MathContext mc = new MathContext(10);
        return BigDecimal.ONE.divide(new BigDecimal(3), 2, RoundingMode.HALF_UP)
                .multiply(new BigDecimal(Math.PI)).multiply(radius.pow(2, mc)).multiply(height);
    }
}
