package io.codelex.oop.shapes2;

import java.math.BigDecimal;
import java.math.MathContext;

public class Triangle extends Shape {

    BigDecimal width;
    BigDecimal height;

    public Triangle(BigDecimal width, BigDecimal height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public BigDecimal calculateArea() {
        MathContext m = new MathContext(1);
        return new BigDecimal(0.5).multiply(width).multiply(height).round(m);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        MathContext mc = new MathContext(10);
        BigDecimal thirdSide = width.multiply(width).add(height.multiply(height)).sqrt(mc);
        return thirdSide.add(width).add(height);
    }
}
