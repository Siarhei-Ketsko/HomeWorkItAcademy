package com.homework.lesson10;


public class FormatFullName {
    public static void main(String[] args) {
        System.out.println(formatFullName("сергей", "кецко", "сергеевич"));
    }

    private static String formatFullName(String name, String secondName, String patronymic) {
        String a = secondName.charAt(0) + "." + name.charAt(0) + "." + patronymic.charAt(0);
        return a.toUpperCase();
    }
}
