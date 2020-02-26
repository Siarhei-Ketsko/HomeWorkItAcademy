package com.homework.lesson3;
import java.util.Random;

public class GenerateDoubleNumbers {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Random random = new Random();
        double sum = 0.0;
        double minumum = Integer.MAX_VALUE;
        double maximum = Integer.MIN_VALUE;
        boolean sorted = false;
        double temp;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble() * 100;
            sum += arr[i];

            if (arr[i] < minumum) {
                minumum = arr[i];
            }
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Минимальное " + minumum);
        System.out.println("Среднее " + sum / arr.length);
        System.out.println("Максимальное " + maximum);
    }
}



