package com.homework.lesson10;


public class FormatterIntegerNumber {
    private static long start;
    private static long end;
    private static String numberString;

    public static void main(String[] args) {
        System.out.println(formatOne(100000000L));
    }

    public static String formatOne(long number) {
        start = System.currentTimeMillis();

        String numberParse = Long.toString(number);
        if (numberParse.length() <= 10) {

            String newNumber = "0000000000" + number;

            numberString = newNumber.substring(newNumber.length() - (newNumber.length() - numberParse.length()));

            end = System.currentTimeMillis() - start;
            System.out.println("Время выполнения первого способа: " + end + " ms");
        }
        else {
            numberString = "0000000000";
        }

        return numberString;
    }
    public static String formatTwo(long number) {


        return "f";
    }
}
