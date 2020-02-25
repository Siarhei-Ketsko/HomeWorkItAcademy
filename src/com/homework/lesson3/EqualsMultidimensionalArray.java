package com.homework.lesson3;

import java.util.Scanner;

public class EqualsMultidimensionalArray {
    public static void main(String[] args) {
        int[][] firstArray = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int[][] secondArray = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индексы элементов двумерных массивов через пробел в формате \"i j i j\"");
        int elemOne = firstArray[sc.nextInt()][sc.nextInt()];
        int elemTwo = secondArray[sc.nextInt()][sc.nextInt()];

        equals(elemOne, elemTwo);
    }

    public static void equals(int elemOne, int elemTwo) {
        if (elemOne == elemTwo) {
            System.out.println("Равны");
        }
        else {
            System.out.println("Не равны");
        }
    }
}
