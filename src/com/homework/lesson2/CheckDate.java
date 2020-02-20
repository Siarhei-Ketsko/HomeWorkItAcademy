package com.homework.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckDate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        int month = Integer.parseInt(reader.readLine());
        int year = Integer.parseInt(reader.readLine());
        int xDay = 0;


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
