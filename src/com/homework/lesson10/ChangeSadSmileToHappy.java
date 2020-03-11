package com.homework.lesson10;

public class ChangeSadSmileToHappy {
    private static String test = "Тестируем:(замену :) смайликов:( в строке :(";

    public static void main(String[] args) {

        System.out.println(changeSmile(test));

    }
    private static String changeSmile(String str) {
        return str.replace(":(", ":)");
    }
}

