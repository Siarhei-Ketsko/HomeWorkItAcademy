package com.homework.lesson13;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentListUtils {

    private static int BadScore = 4;
    private static int maxScore = Integer.MIN_VALUE;
    private static int max = 0;

    public static List delBadScores(List<Integer> list) {

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i <= BadScore) {
                iterator.remove();

            }
        }

        return list;
    }

    public static List<Integer> setScores(List<Integer> list) {
        for (int i = 0; i < 10; i++) {

            list.add((int) (Math.random() * 11));

        }
        return list;
    }

    public static void searchMaxScore(List<Integer> list) {


        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {

            max = iterator.next();
            if (max > maxScore) {

                maxScore = max;

            }
        }

        System.out.println("Максимальная оценка: " + maxScore);

    }

    public static void printStudentsRevers(List<Student> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }

    public static void printStudentsReversTwo(List<Student> list) {
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void printScores(Object obj, List<Integer> list) {
        System.out.printf("Студен: " + obj + "%nОценки: " + list + "%n");


    }
}
