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


        LocalDate future = LocalDate.of(2020, Month.JUNE, 25);

        LocalDate current = LocalDate.now();

        LocalTime time = LocalTime.now();
        LocalDateTime test = LocalDateTime.of(current, time);
        LocalDateTime dateTimeCurrent = LocalDateTime.of(current.getYear(),current.getMonthValue(),current.getDayOfMonth(), 23, 59);
        LocalDateTime dateTimeFuture = LocalDateTime.of(2020, 6, 25, 0, 0);



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

    private static void formatAndPrintDateToString(LocalDate date) {

        String formatDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println(formatDate);

    }

    private static long getCountDay(LocalDate startDate, LocalDate endDate) {

       // return startDate.toEpochDay() - endDate.toEpochDay();

        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    private static void getSecondsPM(LocalDateTime startDate, LocalDateTime endDate) {

        Duration duration = Duration.between(startDate, endDate);

        long res = duration.getSeconds();



        System.out.println(res);

    }

    private static LocalDate getDateFromString(String stringDate) {

        LocalDate parseDate = LocalDate.parse(stringDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));

       return parseDate;
    }

    private static void testCustomAdjuster() {

        LocalDate plusFortyTwoDays = LocalDate.now().with(new PlusFortyTwoDays());

        System.out.println(plusFortyTwoDays);

    }

    private static void changeDate() {

        LocalDate changeDate = LocalDate.now().with(new ChangeDateFirstJanuary());

        System.out.println(changeDate);

    }


}
