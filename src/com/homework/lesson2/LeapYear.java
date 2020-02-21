package com.homework.lesson2;
import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args)  {
        Scanner sc  = new Scanner(System.in);
        int year;
        System.out.println("Введите год");
        while (true) {
            year = sc.nextInt();
            if (year == 0) {
                break;
            }

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " Год високосный");
                    } else {
                        System.out.println(year + " Год не високосный");
                    }
                } else {
                    System.out.println(year + " Год високосный");
                }
            } else {
                System.out.println(year + " Год не високосный");
            }
            System.out.println("Введите год, или для выхода из программы введите \"0\"");
        }

    }
}
