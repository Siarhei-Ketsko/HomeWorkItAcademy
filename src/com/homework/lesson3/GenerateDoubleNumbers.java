package com.homework.lesson3;
import java.util.Arrays;
import java.util.Random;

public class GenerateDoubleNumbers {
    public static void main(String[] args) {
        double[] arr = new double[1000];
        Random random = new Random();
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble()*100;
            sum += arr[i];
        }
        Arrays.sort(arr);

        System.out.println("Минимальное " + arr[0]);
        System.out.println("Среднее " + sum/arr.length);
        System.out.println("Максимальное " + arr[arr.length-1]);
    }
}


