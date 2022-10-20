package io.codelex.dateandtime.practice.dateperiod;

import java.time.LocalDate;

public class DatePeriodTest {
    public static void main(String[] args) {
        DatePeriod period1 = new DatePeriod(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 1, 15));
        DatePeriod period2 = new DatePeriod(LocalDate.of(2022, 1, 10),
                LocalDate.of(2022, 1, 25));

        DatePeriod overlap = period1.intersection(period2);
        System.out.println(overlap);

    }
}
