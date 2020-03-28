package com.homework.lesson16;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataTest {

    @Test
    public void testCreateLocalDate() {

        LocalDate future = LocalDate.of(2020, Month.JUNE, 25);

        System.out.println(future);

    }

    @Test
    public void testLocalDatePlusThreeMonth() {

        LocalDate current = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime threeMonth = LocalDateTime.of(current.plusMonths(3), time);
        System.out.println(threeMonth);

    }

    @Test
    public void testFormatAndPrintDateToString(){

        LocalDate date = LocalDate.now();

        String formatDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println(formatDate);

    }

    @Test
    public void testGetDateFromString() {

        LocalDate parseDate = LocalDate.parse("26-03-2014",DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println(parseDate);

    }

    @Test
    public void testCountDays() {

        LocalDate current = LocalDate.now();
        LocalDate future = LocalDate.of(2020,6,25);

        System.out.println(ChronoUnit.DAYS.between(current, future));

    }

    @Test
    public void testGetSecondsPM() {

        LocalDateTime dateTimeCurrent = LocalDateTime.of(LocalDate.now().getYear(),LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth(), 23, 59);
        LocalDateTime dateTimeFuture = LocalDateTime.of(2020, 6, 25, 0, 0);

        Duration duration = Duration.between(dateTimeCurrent, dateTimeFuture);

        long res = duration.getSeconds();

        System.out.println(res);

    }

    @Test
    public void testCustomAdjusterPlusDays() {

        LocalDate plusFortyTwoDays = LocalDate.now().with(new PlusFortyTwoDays());

        System.out.println(plusFortyTwoDays);

    }

    @Test
    public void testCustomAdjusterChangeDate() {

        LocalDate changeDate = LocalDate.now().with(new ChangeDateFirstJanuary());

        System.out.println(changeDate);

    }

}
