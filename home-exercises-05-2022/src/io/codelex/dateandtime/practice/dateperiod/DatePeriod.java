package io.codelex.dateandtime.practice.dateperiod;

import java.time.LocalDate;

public class DatePeriod {

    LocalDate start;
    LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate startDate(DatePeriod period) {
        if (this.start.isAfter(period.start)) {
            return this.start;
        }
        return period.start;
    }

    public boolean overlapChecker(DatePeriod period) {
        return this.start.isBefore(period.start) && this.end.isAfter(period.end) ||
                this.start.isAfter(period.start) && this.start.isBefore(period.end) ||
                this.end.isAfter(period.start) && this.end.isBefore(period.end);
    }

    public LocalDate endDate(DatePeriod period) {
        if (this.end.isAfter(period.end)) {
            return period.end;
        }
        return this.end;


    }

    public DatePeriod intersection(DatePeriod period) {
        if (overlapChecker(period)) {
            return new DatePeriod(startDate(period), endDate(period));
        }
        return null;
    }

    @Override
    public String toString() {
        return "DatePeriod{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
