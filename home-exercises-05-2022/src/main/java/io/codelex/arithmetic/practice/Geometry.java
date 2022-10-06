package io.codelex.arithmetic.practice;

import java.math.BigDecimal;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
        return new BigDecimal(Math.PI).multiply(radius.pow(2));

    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal height) {
        return (base.multiply(height)).multiply(new BigDecimal(0.5));
    }
}
