package com.homework.lesson3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 если хотите посчитать циклом \"FOR\" или 2 циклом \"WHILE \"");
        int number = sc.nextInt();
        int result = 1;
        int y = 1;
        int n = 0;
        if (number == 1) {
            System.out.println("Введите число");
            number = sc.nextInt();
            result = goForCycle(number, result);
            printResult(result, number);
        }

        else if (number ==2){
            System.out.println("Введите число");
            number = sc.nextInt();
            result = goWhileCycle(number, result, y, n);
            printResult(result, number);
        }
        else {
            System.out.println("Ошибка, вы ввели неверное число, перезапустите программу");
        }


    }

    public static int goWhileCycle(int number, int result, int y, int n) {
        while (n<number) {
            result *= y;
            y++;
            n++;
        }
        return result;
    }

    public static int goForCycle(int number, int result) {
        for (int i = 1; i <=number; i++){

            result *= i;
        }
        return result;
    }

    public static void printResult(int result, int number) {
        System.out.println("Факториал числа " + number + " равен " + result);
    }

}


