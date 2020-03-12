package com.homework.lesson10;

public class CountWords {
    private static int count;

    public static void main(String[] args) {

        System.out.println(countWords("Один два     три   "));
    }
    public static int countWords(String text) {
        String[] words = text.split("\\s*(\\s|,|@|#|%|!|\\.)\\s*");

        for (int i = 0; i < words.length; i++) {
            count++;
        }
        return count;
    }

}
