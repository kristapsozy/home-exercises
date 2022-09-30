package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.EnumSet;
import java.util.Set;

public class HoursCalculator {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2022, 02, 01);
        LocalDate end = LocalDate.now();
        Set<DayOfWeek> weekend = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        final long weekDaysBetween = start.datesUntil(end)
                .filter(day -> !weekend.contains(day.getDayOfWeek()))
                .count();
        System.out.println("Office employee works " + weekDaysBetween * 8 + " hours from " + start + " to " + end);
    }
}
