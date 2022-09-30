package io.codelex.oop.shapes2;

import java.math.BigDecimal;

public class ShapeApp {
    public static void main(String[] args) {
        Hexagon hexagon = new Hexagon(new BigDecimal(4));
        System.out.println(hexagon.calculateArea());
        System.out.println(hexagon.calculatePerimeter());

        Triangle triangle = new Triangle(new BigDecimal(4), new BigDecimal(3));
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(new BigDecimal(4), new BigDecimal(5));
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Cone cone = new Cone(new BigDecimal(2), new BigDecimal(5), new BigDecimal(7));
        System.out.println(cone.calculateVolume());
        System.out.println(cone.calculateArea());
        System.out.println(cone.calculatePerimeter());

        Qube qube = new Qube(new BigDecimal(5));
        System.out.println(qube.calculateVolume());
        System.out.println(qube.calculateArea());
        System.out.println(qube.calculatePerimeter());


    }
}
