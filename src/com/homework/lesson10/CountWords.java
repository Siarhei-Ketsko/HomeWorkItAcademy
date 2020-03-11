package com.homework.lesson10;

public class CountWords {
    private static int cout;
    public static String text = "Один два     три   ";

    public static void main(String[] args) {

        System.out.println(countWords(text));
    }
    public static int countWords(String text) {
        String[] words = text.split("\\s*(\\s|,|@|#|%|!|\\.)\\s*");

        for (int i = 0; i < words.length; i++) {
            cout++;
        }
        return cout;
    }

}
