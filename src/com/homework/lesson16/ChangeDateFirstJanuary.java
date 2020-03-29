package com.homework.lesson16;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import static java.time.temporal.ChronoField.DAY_OF_YEAR;
import static java.time.temporal.ChronoUnit.YEARS;

public class ChangeDateFirstJanuary implements TemporalAdjuster {


    @Override
    public Temporal adjustInto(Temporal temporal) {

        if (LocalDate.now().isBefore(LocalDate.of(LocalDate.now().getYear(), Month.JUNE, 30))) {
            return temporal.with(DAY_OF_YEAR, 1).plus(1, YEARS);
        }
        else
        return temporal.with(DAY_OF_YEAR, 1).minus(1, YEARS);
    }
}
