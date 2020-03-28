package com.homework.lesson16;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class PlusFortyTwoDays implements TemporalAdjuster {


    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(42, ChronoUnit.DAYS);
    }
}
