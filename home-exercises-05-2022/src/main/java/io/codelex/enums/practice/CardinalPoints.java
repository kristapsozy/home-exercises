package io.codelex.enums.practice;

public enum CardinalPoints {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private final String directionText;

    CardinalPoints(String directionText) {
        this.directionText = directionText;
    }

    public String getDirectionText() {
        return directionText;
    }

    public static void printCardinalPoints() {
        for (CardinalPoints point : CardinalPoints.values()) {
            System.out.println(point + ":" + point.directionText + ":" + point.ordinal());
        }
    }
}
