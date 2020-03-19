package com.homework.lesson13;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentListUtils {

    private static int BadScore = 4;
    private static int maxScore = Integer.MIN_VALUE;
    private static int max = 0;

    public static void delBadScores(List<Integer> list) {
        if (list != null) {
            Iterator<Integer> iterator = list.iterator();

            while (iterator.hasNext()) {
                int i = iterator.next();
                if (i <= BadScore) {
                    iterator.remove();

                }
            }
        }

    }

    public static void setScores(List<Integer> list) {
        if (list != null) {
            for (int i = 0; i < 10; i++) {

                list.add((int) (Math.random() * 11));

            }
        }
    }

    public static void searchMaxScore(List<Integer> list) {
        if (list != null) {
            Iterator<Integer> iterator = list.iterator();

            while (iterator.hasNext()) {

                max = iterator.next();
                if (max > maxScore) {

                    maxScore = max;

                }
            }
        }

        System.out.println("Максимальная оценка: " + maxScore);

    }

    public static void printStudentsRevers(List<Student> list) {
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }
        }

    }

    public static void printStudentsReversTwo(List<Student> list) {
        if (list != null) {
            Collections.reverse(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

    }

    public static void printScores(Object obj, List<Integer> list) {
        if (list != null && obj != null) {
            System.out.printf("Студен: " + obj + "%nОценки: " + list + "%n");
        }

    }
}
