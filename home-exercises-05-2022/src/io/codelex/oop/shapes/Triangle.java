package io.codelex.oop.shapes;

import java.math.BigDecimal;
import java.math.MathContext;

public class Triangle extends Shape {
    BigDecimal width;
    BigDecimal height;

    public Triangle(int numSides, BigDecimal width, BigDecimal height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public BigDecimal getArea() {
        MathContext m = new MathContext(1);
        return new BigDecimal(0.5).multiply(width).multiply(height).round(m);
    }

    @Override
    public BigDecimal getPerimeter() {
        MathContext mc = new MathContext(10);
        BigDecimal thirdSide = width.multiply(width).add(height.multiply(height)).sqrt(mc);
        return thirdSide.add(width).add(height);
    }
}
