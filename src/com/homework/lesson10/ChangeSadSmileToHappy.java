package com.homework.lesson10;

public class ChangeSadSmileToHappy {

    public static void main(String[] args) {

        System.out.println(changeSmile("Тестируем:(замену :) смайликов:( в строке :("));

    }
    private static String changeSmile(String str) {
        return str.replace(":(", ":)");
    }
}

