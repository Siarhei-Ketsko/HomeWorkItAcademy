package com.homework.lesson15;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 1. Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 *
 * 2. Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
 *
 * 3. Задан файл с текстом, найти и вывести в консоль все слова,  для которых последняя буква.
 *    одного слова совпадает с первой буквой следующего слова.
 *
 * 4. Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
 *
 * */
//Users/klaks/Documents/Java IT-ACADEMY cours/JD 1 new/Lection 15 Потоки ввода вывода/test txt homework.txt

public class TextFile {

    private static final Logger LOGGER = Logger.getLogger(TextFile.class);

    public static void main(String[] args) {


        File file = new File(File.separator + "Users" + File.separator + "klaks" + File.separator + "Documents" + File.separator + "Java IT-ACADEMY cours" +
                File.separator + "JD 1 new" + File.separator + "Lection 15 Потоки ввода вывода" + File.separator + "test txt homework.txt");


        getLineByLine(file);
        getVowels(file);
        getFirstCharEqualsLast(file);
        getTheLongestNumber(file);

    }

    public static void getLineByLine(File file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }


        } catch (Exception e) {

            LOGGER.error(e.getMessage(), e);

        }

    }

    public static void getVowels(File file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            Pattern pat = Pattern.compile("\\b([aeiouy])\\w*");
            Matcher matcher = pat.matcher("");

            while ((line = reader.readLine()) != null) {

                matcher.reset(line);
                while (matcher.find()) {

                    System.out.println(matcher.group());
                }

            }

        } catch (IOException e) {

            LOGGER.error(e.getMessage(), e);

        }

    }

    public static void getFirstCharEqualsLast(File file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            Pattern pat = Pattern.compile("\\b([\\w])\\w*\\1\\b");
            Matcher matcher = pat.matcher("");

            while ((line = reader.readLine()) != null) {

                matcher.reset(line);
                while (matcher.find()) {

                    System.out.println(matcher.group());
                }

            }

        } catch (IOException e) {

            LOGGER.error(e.getMessage(), e);

        }


    }

    public static void getTheLongestNumber(File file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            Pattern pat = Pattern.compile("\\b[\\d]\\d*");
            Matcher matcher = pat.matcher("");

            while ((line = reader.readLine()) != null) {
                int index = 0;
                matcher.reset(line);
                while (matcher.find()) {
                    if (matcher.group().length() > index) {
                        index = matcher.group().length();

                        System.out.println(matcher.group());
                    }
                }

            }

        } catch (Exception e) {

            LOGGER.error(e.getMessage(), e);

        }

    }

}
