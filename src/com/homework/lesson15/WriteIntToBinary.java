package com.homework.lesson15;

import java.io.*;

/*
*
*Записать в двоичный файл 20 случайных чисел типа int со значением больше 255.
* Прочитать записанный файл, распечатать числа и их среднее арифметическое.
*
* */

public class WriteIntToBinary {

    private static int[] arr = new int[]{256, 257, 258, 259, 260, 270, 280, 256, 259, 259, 352, 644, 277, 568, 277, 290, 257, 444, 523, 876};

    public static void main(String[] args) {

        File file = new File(File.separator + "Users" + File.separator + "klaks" + File.separator + "Documents" + File.separator + "Java IT-ACADEMY cours" +
                File.separator + "JD 1 new" + File.separator + "Lection 15 Потоки ввода вывода" + File.separator + "IntToBinary.txt");

        bitShift(file);
        readBitShift(file);

    }

    public static void bitShift(File file) {

        try (FileOutputStream out = new FileOutputStream(file)) {

            for (int i = 0; i < arr.length; i++) {

                out.write((arr[i] >>> 24) & 0xFF);
                out.write((arr[i] >>> 16) & 0xFF);
                out.write((arr[i] >>> 8) & 0xFF);
                out.write((arr[i] >>> 0) & 0xFF);
            }
        } catch (Exception e) {


        }

    }

    public static void readBitShift(File file) {

        int[] testArr = new int[20];
        int res = 0;

        try (FileInputStream input = new FileInputStream(file)) {

            for (int i = 0; i < testArr.length; i++) {

                int ch1 = input.read();
                int ch2 = input.read();
                int ch3 = input.read();
                int ch4 = input.read();
                if ((ch1 | ch2 | ch3 | ch4) < 0) {
                    throw new EOFException();
                }
                testArr[i] = ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));

                 res += testArr[i];
            }
            System.out.println((double)res/testArr.length);


        } catch (Exception e) {


        }
    }
}