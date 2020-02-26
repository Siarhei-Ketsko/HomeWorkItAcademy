package com.homework.lesson3;
import java.util.Random;

public class GenerateDoubleNumbers {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Random random = new Random();
        double sum = 0.0;
        double minumum = Integer.MAX_VALUE;
        double maximum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble()*100;
            sum += arr[i];

            if(arr[i] < minumum) {
                minumum = arr[i];
            }
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        System.out.println("Минимальное " + minumum);
        System.out.println("Среднее " + sum/arr.length);
        System.out.println("Максимальное " + maximum);
    }
}


