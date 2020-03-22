package com.homework.lesson14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*

* Имеется текст. Следует составить для него частотный словарь.
*
* */


public class FrequencyDictionary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Введите слова которые хотите добавить в словарь для поиска и нажмите Enter %n" +
                "Потом скопируйте и вставьте текст или введите в консоль в котором хотите найти эти слова и нажмите Enter %n");
        System.out.println(getFrequency(createLibrary(sc.nextLine()), StringSplitWords(sc.nextLine())));

    }

    public static String[] StringSplitWords(String str) {

        String[] words = str.split("\\s*(\\s|,|!|\\?|\"|\\.)\\s*");

        return words;
    }

    public static Map<String, Integer> createLibrary(String str) {

        String [] spl = str.split("\\s*(\\s|,|!|\\?|\"|\\.)\\s*");

        Map<String, Integer> library = new HashMap<>();

        for (int i = 0; i < spl.length; i++) {

            library.put(spl[i],0);
        }

        return library;
    }


    public static Map<String, Integer> getFrequency(Map<String, Integer> map, String[] str) {


        for (int i = 0; i < str.length; i++) {
            for (Map.Entry<String, Integer> word : map.entrySet()) {
                if (str[i].equalsIgnoreCase(word.getKey())) {
                    word.setValue(word.getValue() + 1);
                }

            }
        }

        return map;
    }

}
