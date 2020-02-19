package com.homework.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstWord = reader.readLine();
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
