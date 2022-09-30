package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public enum ConversionType {
    METERS_TO_YARDS(new BigDecimal(1.0936133), "Meters"),
    YARDS_TO_METERS(new BigDecimal(0.9144), "Yards"),
    CENTIMETERS_TO_ICHES(new BigDecimal(0.393700787), "Centimeters"),
    INCHES_TO_CENTIMETERS(new BigDecimal(2.54), "Inches"),
    KILOMETERS_TO_MILES(new BigDecimal(0.621371192), "Kilometers"),
    MILES_TO_KILOMETERS(new BigDecimal(1.609344), "Miles");

    public final BigDecimal value;
    public final String conversationType;


    ConversionType(BigDecimal value, String conversationType) {
        this.value = value;
        this.conversationType = conversationType;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getConversationType() {
        return conversationType;
    }

}
