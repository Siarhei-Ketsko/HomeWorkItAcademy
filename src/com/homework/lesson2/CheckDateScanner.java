package com.homework.lesson2;

import java.util.Scanner;

public class CheckDateScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int xDay = Integer.MIN_VALUE;



        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                xDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                xDay = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            xDay = 29;
                        }
                        else {
                            xDay = 28;
                        }
                    }
                    else {
                        xDay = 29;
                    }
                }
                else {
                    xDay = 28;
                }
                break;

        }


        if (day > xDay) {
            System.out.println("Даты не существует");
        }
        else {
            System.out.println("Дата существует");
        }

    }
}




