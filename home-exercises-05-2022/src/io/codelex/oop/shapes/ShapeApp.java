package io.codelex.oop.shapes;

import java.math.BigDecimal;

public class ShapeApp {
    public static void main(String[] args) {
        Rectagle rectagle = new Rectagle(4, new BigDecimal(4), new BigDecimal(5));
        Triangle triangle = new Triangle(3, new BigDecimal(3), new BigDecimal(4));
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(rectagle.getArea());
        System.out.println(rectagle.getPerimeter());

    }
}
