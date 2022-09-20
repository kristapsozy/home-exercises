package io.codelex.classesandobjects.practice.points;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swapPoints(Point p1, Point p2) {
        int p1x = p1.x;
        p1.x = p2.x;
        p2.x = p1x;
    }
}
