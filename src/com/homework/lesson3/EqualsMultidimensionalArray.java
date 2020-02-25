package com.homework.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsMultidimensionalArray {
    public static void main(String[] args) {
        int[][] firstArray = {{1,2,3,4,5}, {6,7,8,9,10}};
        int[][] secondArray = {{1,2,3,4,5}, {6,7,8,9,10}};
        Scanner sc = new Scanner(System.in);
        int indexFirstElemI = sc.nextInt();
        int indexFirstElemJ = sc.nextInt();
        int indexSecondElemI = sc.nextInt();
        int indexSecondElemJ = sc.nextInt();

        equals(firstArray[indexFirstElemI][indexFirstElemJ] == secondArray[indexSecondElemI][indexSecondElemJ]);
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
