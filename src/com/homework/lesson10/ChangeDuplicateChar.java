package com.homework.lesson10;

public class ChangeDuplicateChar {

    public static void main(String[] args) {

        System.out.println(changeDuplicate("aaabbcdeef"));
    }

    public static String changeDuplicate(String text) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
           String check = text.substring(i, i + 1);
            if (stb.indexOf(check) == -1) {
                stb.append(check);
            }
        }
        return stb.toString();
    }
}

