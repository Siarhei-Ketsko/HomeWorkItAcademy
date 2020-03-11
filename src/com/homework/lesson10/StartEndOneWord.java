package com.homework.lesson10;

public class StartEndOneWord {
    private static String test = "тор торс ток  время не тор";

    public static void main(String[] args) {
        System.out.println(checkString(test, "тор"));
    }

    public static boolean checkString(String str, String word) {

        return str.startsWith(word + " ") && str.endsWith(" " + word);
    }
}

