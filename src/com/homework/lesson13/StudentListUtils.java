package com.homework.lesson13;

import java.util.Iterator;
import java.util.List;

public class StudentListUtils {

    private static int BadScore = 4;

    public static List delBadScores(List<Integer> arr) {

        Iterator<Integer> iterator = arr.iterator();

        while (iterator.hasNext()) {

            if (iterator.next() <= BadScore) {
                iterator.remove();

            }
        }

        return arr;
    }

    public static Object setScores(Object obj, List<Integer> arr) {
        for (int i = 0; i < 99; i++) {

            arr.add((int) (Math.random() * 11));

        }
        return obj;
    }

    public static void printStudentsRevers(List<Student> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }

    }

    public static void printScores(Object obj, List<Integer> arr) {
        System.out.printf("Студен: " + obj + "%nОценки: " + arr);


    }
}
