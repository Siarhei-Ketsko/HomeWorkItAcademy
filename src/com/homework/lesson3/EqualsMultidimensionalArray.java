package com.homework.lesson3;

import java.util.Scanner;

public class EqualsMultidimensionalArray {
    public static void main(String[] args) {
        int[][] firstArray = {{1,2,3,4,5}, {6,7,8,9,10}};
        int[][] secondArray = {{1,2,3,4,5}, {6,7,8,9,10}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индексы элементов двумерных массивов через пробел в формате \"i j i j\"");
        equals(firstArray[sc.nextInt()][sc.nextInt()] == secondArray[sc.nextInt()][sc.nextInt()]);
    }

    public static void equals(boolean b) {
        if (b) {
            System.out.println("Элемпнты равны");
        }
        else {
            System.out.println("Элементы не равны");
        }
    }
}
