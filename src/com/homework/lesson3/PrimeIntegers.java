package com.homework.lesson3;

import java.util.Scanner;

public class PrimeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number == 1) {
                System.out.println("Число не простое");
            }
            else if (number == 2) {
                    System.out.println("Число простое");
                }
            else if (number % 1 == 0 && number % number == 0 && number % 2 != 0) {
                System.out.println("Число " + number + " простое");
            } else {
                System.out.println("Число не простое");
            }
        }

    }
}


