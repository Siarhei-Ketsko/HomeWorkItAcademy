package com.homework.lesson13;

import java.util.ArrayList;

public class StackUtils {

    public static ArrayList<Integer> addNumbers(String number) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {

            arr.add(Integer.parseInt(String.valueOf(number.charAt(i))));

        }
        return arr;
    }

}
