package com.homework.lesson16;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
 *
 * Создать объект класса LocalDate, представляющий собой дату 25.06.2020. Вывести полученную дату в консоль.
 * Создать объект LocalDate, представляющий собой сегодняшнюю дату. Используя этот объект, создать другой объект LocalTime, представляющий собой дату через 3 месяца после сегодняшней. Вывести эту дату в консоль.
 * Создать объект LocalDate, представляющий собой сегодняшнюю дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку в консоль.
 * Дана строка вида "26-03-2014". Получить объект LocalDate, представляющий собой дату, полученную из этой строки.
 * Создать объект LocalDate, представляющий собой сегодняшнюю дату. Создать объект LocalDate, представляющий собой дату 25.06.2020. Используя созданные объекты, найти количество дней между этими двумя датами.
 * Даны два объекта LocalDate из предыдущего задания. Подсчитать количество секунд между полуночью первой даты и полуночью второй даты.
 * Написать свою реализацию интерфейса TemporalAdjuster, которая бы прибавляла к дате 42 дня.
 * (*) Написать свою реализацию интерфейса TemporalAdjuster, которая бы изменяла дату на ближайшее (в днях) 1 января.
 *
 * */


public class DateHome {

    public static void main(String[] args) {

//        formatAndPrintDateToString(current);
//
//        System.out.println(getCountDay(current,future));
//
//        System.out.println( getDateFromString("12-12-2009"));
//
//        getSecondsPM(dateTimeCurrent,dateTimeFuture);
//
//        testCustomAdjuster();
//
//        changeDate();

    }


    public static LocalDate createLocalDate() {

        LocalDate future = LocalDate.of(2020, 06, 25);

        System.out.println(future);

        return future;
    }

    public static LocalDate currentDatePlusThreeMonth(LocalDate date) {

        return date.plusMonths(3);
    }


    public static String formatAndPrintDateToString(LocalDate date) {

        String formatDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println(formatDate);

        return formatDate;

    }

    public static LocalDate getDateFromString(String str) {

        LocalDate parseDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println(parseDate);

        return parseDate;
    }

    public static long getCountDay() {

        LocalDate future = LocalDate.of(LocalDate.now().getYear(), Month.JUNE, 25);

        LocalDate current = LocalDate.now();


        return ChronoUnit.DAYS.between(current, future);
    }

    public static long getSecondsPM() {

        LocalDate current = LocalDate.now();
        LocalDateTime dateTimeCurrent = LocalDateTime.of(current.getYear(), current.getMonthValue(), current.getDayOfMonth(), 0, 0);
        LocalDateTime dateTimeFuture = LocalDateTime.of(2020, 6, 25, 0, 0);

        Duration duration = Duration.between(dateTimeCurrent, dateTimeFuture);

        return duration.getSeconds();
    }


    public static LocalDate testCustomAdjuster() {

        LocalDate plusFortyTwoDays = LocalDate.now().with(new PlusFortyTwoDays());

        return plusFortyTwoDays;
    }

    public static LocalDate changeDate() {

        LocalDate changeDate = LocalDate.now().with(new ChangeDateFirstJanuary());

        return changeDate;
    }


}
