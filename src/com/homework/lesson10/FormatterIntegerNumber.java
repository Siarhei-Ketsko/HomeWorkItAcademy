package com.homework.lesson10;

import java.util.Formatter;

public class FormatterIntegerNumber {
    public static void main(String[] args) {
        System.out.println(formatOne(553));
    }

    public static String formatOne(int number) {
        String numberParse = Integer.toString(number);
        String newNumber = "0000000000" + number;
        String numberString = newNumber.substring(newNumber.length() - (newNumber.length() - numberParse.length()));


        return numberString;
    }
}
