package io.codelex.enums.practice.rockpaperscissors;

public enum RockPaperScissors {
    ROCK("r"),
    PAPER("p"),
    SCISSORS("s");

    private String shortName;

    RockPaperScissors(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public static RockPaperScissors getEnumValueOfShortName(String name) {
        for (RockPaperScissors value : RockPaperScissors.values()) {
            if (value.shortName.equals(name)) {
                return value;
            }
        }
        return null;
    }
}

