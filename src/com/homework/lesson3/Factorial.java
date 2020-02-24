package com.homework.lesson3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 если хотите посчитать циклом \"FOR\" или 2 циклом \"WHILE \"");
        int number = sc.nextInt();
        int result = 1;
        int i = 1;
        if (number == 1) {
            System.out.println("Введите число");
            number = sc.nextInt();
            result = goForCycle(number, result, i);
            printResult(result, number);
        }

        else if (number ==2){
            System.out.println("Введите число");
            number = sc.nextInt();
            result = goWhileCycle(number, result, i);
            printResult(result, number);
        }
        else {
            System.out.println("Ошибка, вы ввели неверное число, перезапустите программу");
        }
    }

    public static int goWhileCycle(int number, int result, int i) {
        while (i<=number) {
            result *= i;
            i++;
        }
        return result;
    }

    public static int goForCycle(int number, int result, int i) {
        for (; i <=number; i++){
            result *= i;
        }
        return result;
    }

    public static void printResult(int result, int number) {
        System.out.println("Факториал числа " + number + " равен " + result);
    }

}


