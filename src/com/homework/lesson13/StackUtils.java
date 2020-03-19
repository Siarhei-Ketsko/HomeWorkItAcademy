package com.homework.lesson13;

import java.util.ArrayList;

public class StackUtils {

    public static ArrayList<Integer> addNumber(ArrayList<Integer> arr, String number) {
        for (int i = 0; i < number.length(); i++) {

            arr.add(Integer.parseInt(String.valueOf(number.charAt(i))));

        }
        return arr;
    }

    public static ArrayList<Integer> push(ArrayList<Integer> arr, String digit) {

        arr.add(Integer.parseInt(digit));

        return arr;
    }

    public static ArrayList<Integer> pop(ArrayList<Integer> arr) {

        arr.remove(arr.size()-1);

        return arr;
    }

    public static void printReversNumber(ArrayList<Integer> arr) {

        for (int i = arr.size()-1; i >=0; i--) {

            System.out.println(arr.get(i));

        }

    }

}
