package com.homework.lesson15;

/*
 *
 * Задан файл с java-кодом. Прочитать текст программы из файла
 * и записать в другой файл в обратном порядке символы каждой строки.
 *
 * */

import org.apache.log4j.Logger;

import java.io.*;

public class ReverseJavaClass {

    private static final Logger LOGGER = Logger.getLogger(ReverseJavaClass.class);

    public static void main(String[] args) {

        File javaRead = new File("/Users/klaks/HomeWork/src/com/homework/lesson15/RecursionDirectories.java");
        File javaWrite = new File("/Users/klaks/Documents/Java IT-ACADEMY cours/JD 1 new/Lection 15 Потоки ввода вывода/JavaReverseFile.txt");


        reverseWrite(javaRead, javaWrite);
    }

    public static void reverseWrite(File original, File copyFile) {

        try (BufferedReader reader = new BufferedReader(new FileReader(original));
             BufferedWriter writer = new BufferedWriter(new FileWriter(copyFile))) {

            String line;
            while ((line = reader.readLine()) != null) {

                for (int i = line.length() - 1; i >= 0; i--) {

                    writer.write(line.charAt(i));
                }
                writer.write("\n");

            }

        } catch (IOException e) {

            LOGGER.error(e.getMessage(), e);

        }
    }
}
