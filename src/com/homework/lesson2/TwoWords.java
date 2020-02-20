package com.homework.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое слово");
        String firstWord = reader.readLine();
        System.out.println("Введите второе слово");
        String secondWord = reader.readLine();

        if (firstWord.equals(secondWord)) {
            System.out.println("Отлично! Слова одинаковы");
        }
        else if (firstWord.equalsIgnoreCase(secondWord)) {
            System.out.println("Хорошо. Почти одинаковы");
        }
        else if (firstWord.length() == secondWord.length()) {
            System.out.println("Ну, хотя бы они одной длины");
        }
        else {
            System.out.println("Слова вообще разные");
        }

    }

}
