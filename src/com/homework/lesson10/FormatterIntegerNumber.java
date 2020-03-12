package com.homework.lesson10;


public class FormatterIntegerNumber {
    private static long start;
    private static long end;

    public static void main(String[] args) {
        System.out.println(formatOne(553));
    }

    public static String formatOne(int number) {
        start = System.currentTimeMillis();

        String numberParse = Integer.toString(number);

        String newNumber = "0000000000" + number;

        String numberString = newNumber.substring(newNumber.length() - (newNumber.length() - numberParse.length()));

        end = System.currentTimeMillis() - start;
        System.out.println("Время выполнения первого способа: " + end + " ms");

        return numberString;
    }
    public static String formatTwo(int number) {


        return "f";
    }
}
