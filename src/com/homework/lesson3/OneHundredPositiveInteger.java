package com.homework.lesson3;

public class OneHundredPositiveInteger {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int number = 1;
        for (int i = 0; i <  arr.length; i++) {
         while (number % 13 != 0 && number %17 != 0) {
             number++;
         }
         arr[i] = number;
         number++;
         }
        for (int i = 0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }
    }
}

