package com.homework.lesson3;

import java.util.Scanner;

public class PrimeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int i = 1;
        int count = 1;
        while (true) {
            System.out.println("Введите число, для выхода из программы введите \"0\"");
            number = sc.nextInt();
            if(number == 0) {
                break;
            }
            count = getCount(number, i, count);
            printResult(count, number);
            count = 1;
        }
    }

    public static int getCount(int number, int i, int count) {
        while (i<number) {
            i++;
            if (number%i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void printResult(int count, int number) {
        if (count == 2) {
            System.out.println("Число " + number + " простое");
        }
        else {
            System.out.println("Число " + number + " не простое");
        }
    }
}


