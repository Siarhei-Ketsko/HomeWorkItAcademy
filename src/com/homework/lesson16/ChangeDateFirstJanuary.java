package com.homework.lesson16;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import static java.time.temporal.ChronoField.DAY_OF_YEAR;
import static java.time.temporal.ChronoUnit.YEARS;

public class ChangeDateFirstJanuary implements TemporalAdjuster {


    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(DAY_OF_YEAR, 1).plus(1, YEARS);
    }
}
