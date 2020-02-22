package com.homework.lesson2;
import java.util.Scanner;

public class TwoWordsScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstWord;
        String secondWord;
        while (true) {
            System.out.println("Введите 2 слова через пробел пример: \"Блок Торт\"");
            System.out.println("Для выхода из программы введите \"Выход\"");
            firstWord = sc.next();

            if (firstWord.equals("Выход")) {
                break;
            }
                secondWord = sc.next();
               if (firstWord.equals(secondWord)) {
                System.out.println("Отлично! Слова одинаковы");
            } else if (firstWord.equalsIgnoreCase(secondWord)) {
                System.out.println("Хорошо. Почти одинаковы");
            } else if (firstWord.length() == secondWord.length()) {
                System.out.println("Ну, хотя бы они одной длины");
            }
        }
    }
}
