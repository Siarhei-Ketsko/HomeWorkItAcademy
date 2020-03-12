package com.homework.lesson10;


import java.util.Formatter;

public class FormatterIntegerNumber {
    private static long start;
    private static long end;
    private static String numberString;

    public static void main(String[] args) {

        System.out.println(formatOne(5353));
        System.out.println(formatTwo(2342424));
        System.out.println(formatThree(12));
    }

    public static String formatOne(long number) {
        start = System.currentTimeMillis();

        String numberParse = Long.toString(number);
        if (numberParse.length() <= 10) {

            String newNumber = "0000000000" + number;

            numberString = newNumber.substring(newNumber.length() - (newNumber.length() - numberParse.length()));

        } else {
            numberString = "0000000000";
        }

        end = System.currentTimeMillis() - start;
        System.out.println("Время выполнения первого способа: " + end + " ms");

        return numberString;
    }

    public static String formatTwo(long number) {
        start = System.currentTimeMillis();

        StringBuilder str = new StringBuilder();
        String numberParse = Long.toString(number);

        if (numberParse.length() <= 10) {
            for (int i = numberParse.length(); i < 10; i++) {
                str.append(0);
            }
           numberString = str.toString() + numberParse;
        } else {
            numberString = "0000000000";
        }

        end = System.currentTimeMillis() - start;
        System.out.println("Время выполнения первого способа: " + end + " ms");

        return numberString;
    }

    public static String formatThree(long number) {
        start = System.currentTimeMillis();

        Formatter fm = new Formatter();
        String numberParse = Long.toString(number);
        if (numberParse.length() <= 10) {

            numberString = fm.format("%010d", number).toString();

        } else {
            numberString = "0000000000";
        }

        end = System.currentTimeMillis() - start;
        System.out.println("Время выполнения первого способа: " + end + " ms");

        return numberString;
    }
}
