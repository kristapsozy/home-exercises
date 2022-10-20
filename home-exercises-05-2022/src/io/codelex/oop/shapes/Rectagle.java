package io.codelex.oop.shapes;

import java.math.BigDecimal;

public class Rectagle extends Shape {
    BigDecimal width;
    BigDecimal height;

    public Rectagle(int numSides, BigDecimal width, BigDecimal height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    public Rectagle(int numSides) {
        super(numSides);
    }

    @Override
    public BigDecimal getArea() {
        return width.multiply(height);
    }

    @Override
    public BigDecimal getPerimeter() {
        return width.add(height).multiply(new BigDecimal(2));
    }
}
