package com.homework.lesson3;

import java.util.Scanner;

public class EqualsMultidimensionalArray {
    public static void main(String[] args) {
        int[][] firstArray = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}};
        int[][] secondArray = {{0, 2, 2, 3, 4}, {1, 1, 7, 8, 9}};
        String [][] fStringArray = {{"а", "а","в"}, {"а", "б", "в"}};
        String [][] sStringArray = {{"а", "а","в"}, {"а", "б", "в"}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индексы элементов двумерных массивов через пробел в формате \"i j i j\"");
        int indexI = sc.nextInt();
        int indexJ = sc.nextInt();
        int indexItwo = sc.nextInt();
        int indexJtwo = sc.nextInt();



        equals(indexI,indexJ,indexItwo,indexJtwo,firstArray,secondArray,fStringArray,sStringArray);
        System.out.println(firstArray[indexI][indexJ]);
        System.out.println(secondArray[indexItwo][indexJtwo]);
    }

    public static void equals(int indexI, int indexJ, int indexItwo, int indexJtwo, int[][]firstArray, int[][]secondArray, String[][]fStringArray, String[][]sStringArray) {
        if (firstArray[indexI][indexJ] == secondArray[indexItwo][indexJtwo]) {
            System.out.println("Элементы int массива Равны");
        } else {
            System.out.println("Элементы int массива не равны");
        }
        if (fStringArray[indexI][indexJ].equals(sStringArray[indexItwo][indexJtwo])) {
            System.out.println("Элементы String массива Равны");
        } else {
            System.out.println("Элементы String массива не равны");
        }
    }
}
