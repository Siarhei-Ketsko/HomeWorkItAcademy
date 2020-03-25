package com.homework.lesson15;

import org.apache.log4j.Logger;

import java.io.*;

/*
 *
 * Сравнить скорость чтения и записи 5 МБ символов при использовании классов буфиризированого
 * и не буфиризированого символьного ввода вывода.
 *
 * */

public class CheckingSpeedBuffered {

    private static final Logger LOGGER = Logger.getLogger(CheckingSpeedBuffered.class);

    private static long start;
    private static long end;

    public static void main(String[] args) {
        File read = new File("/Users/klaks/Documents/Java IT-ACADEMY cours/JD 1 new/Lection 15 Потоки ввода вывода/8mb.txt");
        File write = new File("/Users/klaks/Documents/Java IT-ACADEMY cours/JD 1 new/Lection 15 Потоки ввода вывода/testSpeedWrite.txt");
        File writeNonBuffered = new File("/Users/klaks/Documents/Java IT-ACADEMY cours/JD 1 new/Lection 15 Потоки ввода вывода/testSpeedNonBuff.txt");


        checkBuffered(read, write);

        checkNonBuffered(read, writeNonBuffered);
    }

    private static void checkBuffered(File read, File write) {

        try (BufferedReader reader = new BufferedReader(new FileReader(read));
             BufferedWriter writer = new BufferedWriter(new FileWriter(write))) {
            start = System.currentTimeMillis();
            int nextCharBuffered;

            while ((nextCharBuffered = reader.read()) != -1) {

                writer.write(nextCharBuffered);
            }
            end = System.currentTimeMillis() - start;
            System.out.println(end + "ms");

        } catch (IOException e) {

            LOGGER.error(e.getMessage(), e);
        }

    }

    private static void checkNonBuffered(File read, File write) {

        try (FileReader reader = new FileReader(read);
             FileWriter writer = new FileWriter(write)) {
            start = System.currentTimeMillis();
            int nextChar;
            while ((nextChar = reader.read()) != -1) {

                writer.write(nextChar);

            }

            end = System.currentTimeMillis() - start;
            System.out.println(end + "ms");

        } catch (Exception e) {

            LOGGER.error(e.getMessage(), e);

        }
    }

}
