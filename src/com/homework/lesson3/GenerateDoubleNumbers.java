package com.homework.lesson3;
import java.util.Arrays;
import java.util.Random;

public class GenerateDoubleNumbers {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Random random = new Random();
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble()*100;
            sum += arr[i];
        }
        Arrays.sort(arr);

        System.out.println("Minimux " + arr[0]);
        System.out.println("Average " + sum/arr.length);
        System.out.println("Maximum " + arr[arr.length-1]);
    }
}


