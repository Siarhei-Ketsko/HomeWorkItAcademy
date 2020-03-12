package com.homework.lesson10;

public class StartEndOneWord {

    public static void main(String[] args) {
        System.out.println(checkString("тор торс ток  время не тор", "тор"));
    }

    public static boolean checkString(String str, String word) {

        return str.startsWith(word + " ") && str.endsWith(" " + word);
    }
}

