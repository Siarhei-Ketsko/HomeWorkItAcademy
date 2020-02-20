package com.homework.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
    public static void main(String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " Год високосный");
                }
                else {
                    System.out.println(year + " Год не високосный");
                }
            }
            else {
                System.out.println(year + " Год високосный");
            }
        }
        else {
            System.out.println(year + " Год не високосный");
        }


    }
}
