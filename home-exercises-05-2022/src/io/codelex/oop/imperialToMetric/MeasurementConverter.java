package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class MeasurementConverter {

    public static BigDecimal convert(int value, ConversionType conversationType) {
        return new BigDecimal(value).multiply(ConversionType.valueOf(String.valueOf(conversationType)).value);
    }
}
