package com.homework.lesson3;

import java.util.Random;

public class ThreeRandomNumbers {
    public static void main(String[] args) {
        int [] arr = new int[3];
        Random random = new Random();
        int sortTrueFalse = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = 10 + random.nextInt(100 - 10);
        }
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i] < arr[i+1]) {
                sortTrueFalse++;
            }
            else {
                sortTrueFalse--;
            }
        }
        if (sortTrueFalse > 0) {
            System.out.println("Массив в строго возрастающей последовательности");
        }
        else {
            System.out.println("Массив не в строго возрастающей последовательности");
        }
    }
}
