package io.codelex.oop.shapes2;

import java.math.BigDecimal;

public class Rectangle extends Shape {
    BigDecimal width;
    BigDecimal height;

    public Rectangle(BigDecimal width, BigDecimal height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public BigDecimal calculateArea() {
        return width.multiply(height);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return width.add(height).multiply(new BigDecimal(2));
    }
}
