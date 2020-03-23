package com.homework.lesson15;

import java.io.*;

/*
 * 1. Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 * */
//Users/klaks/Documents/Java IT-ACADEMY cours/JD 1 new/Lection 15 Потоки ввода вывода/test txt homework.txt

public class TextFile {

    public static void main(String[] args) {


        File file = new File(File.separator + "Users" + File.separator + "klaks" + File.separator + "Documents" + File.separator + "Java IT-ACADEMY cours" +
                File.separator + "JD 1 new" + File.separator + "Lection 15 Потоки ввода вывода" + File.separator + "test txt homework.txt");


        getLineByLine(file);

    }

    public static void getLineByLine(File file) {

        try (FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }


        } catch (Exception e) {


        }

    }

}
