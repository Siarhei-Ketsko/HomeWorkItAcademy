package com.homework.lesson3;

import java.util.Scanner;

public class EqualsMultidimensionalArray {

   private static int[][] firstArray = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}};
   private static int[][] secondArray = {{0, 1, 2, 3, 4}, {1, 1, 7, 8, 9}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индексы элементов двумерных массивов через пробел в формате \"i j i j\"");
        if (equals(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt())) {
            System.out.println("Элементы равны");
        }
        else {
            System.out.println("Элементы не равны");
        }
    }
    public static boolean equals(int indexI, int indexJ, int indexItwo, int indexJtwo) {
        return firstArray[indexI][indexJ] == secondArray[indexItwo][indexJtwo];
    }
}

