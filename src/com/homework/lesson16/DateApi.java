package com.homework.lesson16;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static java.time.temporal.ChronoUnit.DAYS;


public class DateApi {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020, Month.JUNE, 25);

        LocalDate current = LocalDate.now();


        LocalTime time = LocalTime.now();
        LocalDateTime test = LocalDateTime.of(current, time);
        LocalDateTime dateTimeCurrent = LocalDateTime.of(current.getYear(),current.getMonthValue(),current.getDayOfMonth(), 23, 59);
        LocalDateTime dateTimeFuture = LocalDateTime.of(2020, 3, 28, 23, 59);



//        formatAndPrintDateToString(current);
//
//        System.out.println(getCountDay(date,current));
//
//        System.out.println( getDateFromString("12-12-2009"));

        getSecondsPM(test,dateTimeFuture);





    }

    private static void formatAndPrintDateToString(LocalDate date) {

        String formatteDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println(formatteDate);

    }

    private static long getCountDay(LocalDate startDate, LocalDate endDate) {

       // return startDate.toEpochDay() - endDate.toEpochDay();

        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    private static void getSecondsPM(LocalDateTime startDate, LocalDateTime endDate) {

        Duration duration = Duration.between(startDate, endDate);

        long res = duration.getSeconds()/60;



        System.out.println(res);

    }

    private static LocalDate getDateFromString(String stringDate) {

        LocalDate parseDate = LocalDate.parse(stringDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));

       return parseDate;
    }


}
