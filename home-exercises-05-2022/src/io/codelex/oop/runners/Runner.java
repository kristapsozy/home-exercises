package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(30, 40),
    INTERMEDIATE(20, 30),
    ADVANCED(15, 20);
    private final int maxRunningTimeinMin;
    private final int minRunningTimeinMin;

    Runner(int minRunningTimeinMin, int maxRunningTimeinMin) {
        this.maxRunningTimeinMin = maxRunningTimeinMin;
        this.minRunningTimeinMin = minRunningTimeinMin;
    }

    public static Runner getFitnessLevel(int time) {
        if (time <= ADVANCED.maxRunningTimeinMin) {
            return ADVANCED;
        } else if (time <= INTERMEDIATE.maxRunningTimeinMin) {
            return INTERMEDIATE;
        } else {
            return BEGINNER;
        }
    }

    public int getMaxRunningTimeinMin() {
        return maxRunningTimeinMin;
    }

    public int getMinRunningTimeinMin() {
        return minRunningTimeinMin;
    }
}
