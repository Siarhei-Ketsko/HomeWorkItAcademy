package com.homework.lesson3;

import java.util.Scanner;

public class EqualsMultidimensionalArray {
    public static void main(String[] args) {
        int[][] firstArray = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int[][] secondArray = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        String [][] fStringArray = {{"а", "б","в"}, {"а", "б", "в"}};
        String [][] sStringArray = {{"а", "б","в"}, {"а", "б", "в"}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индексы элементов двумерных массивов через пробел в формате \"i j i j\"");
        int indexI = sc.nextInt();
        int indexJ = sc.nextInt();


        equals(indexI,indexJ,firstArray,secondArray,fStringArray,sStringArray);
    }

    public static void equals(int indexI, int indexJ, int[][]firstArray, int[][]secondArray, String[][]fStringArray, String[][]sStringArray) {
        if (firstArray[indexI][indexJ] == secondArray[indexI][indexJ]) {
            System.out.println("Элементы int массива Равны");
        } else {
            System.out.println("Элементы int массива не равны");
        }
        if (fStringArray[indexI][indexJ].equals(sStringArray[indexI][indexJ])) {
            System.out.println("Элементы String массива Равны");
        } else {
            System.out.println("Элементы String массива не равны");
        }
    }
}
