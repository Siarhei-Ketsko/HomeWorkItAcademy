package com.homework.lesson16;

import org.junit.Assert;
import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DataTest {

    @Test
    public void testCreateLocalDate() {

        Assert.assertEquals(LocalDate.of(2020, 06, 25), DateHome.createLocalDate());

    }

    @Test
    public void testLocalDatePlusThreeMonth() {

        LocalDate localDate = LocalDate.now();

        Assert.assertEquals(LocalDate.now().plusMonths(3), DateHome.currentDatePlusThreeMonth(localDate));

    }

    @Test(expected = DateTimeException.class)
    public void testMoreThreeMonth () {

        LocalDate localDate = LocalDate.now();

        DateHome.currentDatePlusThreeMonth(localDate.plusDays(23));
    }

    @Test
    public void testFormatAndPrintDateToString() {

        LocalDate localDate = LocalDate.now();

        Assert.assertEquals(LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")), DateHome.formatAndPrintDateToString(localDate));

    }

    @Test
    public void testGetDateFromString() {

        LocalDate localDate = LocalDate.of(2020, 04, 04);

        Assert.assertEquals(localDate, DateHome.getDateFromString("04-04-2020"));

    }
    @Test(expected = DateTimeParseException.class)
    public void testWrongFormat () {

       DateHome.getDateFromString("04.04.2020");
    }

    @Test
    public void testCountDays() {

        LocalDate current = LocalDate.now();
        LocalDate future = LocalDate.of(2020, 6, 25);

        Assert.assertEquals(ChronoUnit.DAYS.between(current, future),DateHome.getCountDay());

    }

    @Test
    public void testGetSecondsPM() {

        LocalDateTime dateTimeCurrent = LocalDateTime.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth(), 0, 0);
        LocalDateTime dateTimeFuture = LocalDateTime.of(2020, Month.JUNE, 25, 0, 0);

        Duration duration = Duration.between(dateTimeCurrent, dateTimeFuture);

        long res = duration.getSeconds();

        Assert.assertEquals(res, DateHome.getSecondsPM());

    }

    @Test
    public void testCustomAdjusterPlusDays() {

        LocalDate plusFortyTwoDays = LocalDate.now().with(new PlusFortyTwoDays());

        Assert.assertEquals(plusFortyTwoDays, DateHome.testCustomAdjuster());


    }

    @Test
    public void testCustomAdjusterChangeDate() {

        LocalDate changeDate = LocalDate.now().with(new ChangeDateFirstJanuary());

        Assert.assertEquals(changeDate, DateHome.changeDate());


    }

}
